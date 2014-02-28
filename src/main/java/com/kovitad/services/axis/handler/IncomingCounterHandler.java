package com.kovitad.services.axis.handler;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;

public class IncomingCounterHandler extends AbstractHandler implements CounterConstants{

	@Override
	public InvocationResponse invoke(MessageContext messageContext)
			throws AxisFault {

		// get the counter property from the configuration context
		ConfigurationContext configurationContext = messageContext
				.getConfigurationContext();
		Integer count = (Integer) configurationContext
				.getProperty(INCOMING_MESSAGE_COUNT_KEY);
		// increment the counter
		count = Integer.valueOf(count.intValue() + 1 + "");
		// set the new count back to the configuration context
		configurationContext.setProperty(INCOMING_MESSAGE_COUNT_KEY, count);
		// print it out
		System.out.println("The incoming message count is now " + count);
		
		return InvocationResponse.CONTINUE;
	}
}
