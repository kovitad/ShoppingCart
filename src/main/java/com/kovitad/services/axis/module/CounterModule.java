package com.kovitad.services.axis.module;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.description.AxisDescription;
import org.apache.axis2.description.AxisModule;
import org.apache.axis2.modules.Module;
import org.apache.neethi.Assertion;
import org.apache.neethi.Policy;

import com.kovitad.services.axis.handler.CounterConstants;

public class CounterModule implements Module, CounterConstants {

	private static final String COUNTS_COMMENT = "Counts";
	private static final String TIMESTAMP_FORMAT = "yyMMddHHmmss";
	private static final String FILE_SUFFIX = ".properties";

	@Override
	public void applyPolicy(Policy policy, AxisDescription axisDescription)
			throws AxisFault {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canSupportAssertion(Assertion assertion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void engageNotify(AxisDescription axisDescription) throws AxisFault {
		System.out.println("inside the engageNotify " + axisDescription);
	}

	@Override
	public void init(ConfigurationContext configurationContext,
			AxisModule axisModule) throws AxisFault {
		// initialize our counters
		System.out.println("inside the init : module");
		initCounter(configurationContext, INCOMING_MESSAGE_COUNT_KEY);
		initCounter(configurationContext, OUTGOING_MESSAGE_COUNT_KEY);

	}

	@Override
	public void shutdown(ConfigurationContext configurationContext)
			throws AxisFault {
		// do cleanup - in this case we'll write the values of the counters to a
		// file
		try {
			SimpleDateFormat format = new SimpleDateFormat(TIMESTAMP_FORMAT);
			File countFile = new File(COUNT_FILE_NAME_PREFIX
					+ format.format(new Date()) + FILE_SUFFIX);
			if (!countFile.exists()) {
				countFile.createNewFile();
			}
			Properties props = new Properties();
			props.setProperty(INCOMING_MESSAGE_COUNT_KEY, configurationContext
					.getProperty(INCOMING_MESSAGE_COUNT_KEY).toString());
			props.setProperty(OUTGOING_MESSAGE_COUNT_KEY, configurationContext
					.getProperty(OUTGOING_MESSAGE_COUNT_KEY).toString());
			// write to a file
			props.store(new FileOutputStream(countFile), COUNTS_COMMENT);
		} catch (IOException e) {
			// if we have exceptions we'll just print a message and let it go
			System.out.println("Saving counts failed! Error is "
					+ e.getMessage());

		}
	}

	private void initCounter(ConfigurationContext configurationContext,
			String key) {
		Integer count = (Integer) configurationContext.getProperty(key);
		if (count == null) {
			configurationContext.setProperty(key, Integer.valueOf("0"));
		}
	}
}
