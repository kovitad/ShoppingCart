package com.kovitad.services.axis.handler;



import org.apache.axis2.AxisFault;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class OutgoingCounterHandler extends AbstractHandler implements
		CounterConstants {

	Logger logger = LoggerFactory.getLogger(OutgoingCounterHandler.class);
	
	@Override
	public InvocationResponse invoke(MessageContext messageContext)
			throws AxisFault {
		

		// get the counter property from the configuration context
		ConfigurationContext configurationContext = messageContext
				.getConfigurationContext();
		Integer count = (Integer) configurationContext
				.getProperty(OUTGOING_MESSAGE_COUNT_KEY);
		// increment the counter
		count = Integer.valueOf(count.intValue() + 1 + "");
		// set the new count back to the configuration context
		configurationContext.setProperty(OUTGOING_MESSAGE_COUNT_KEY, count);
		// print it out
		
		
		logger.info("The outgoing message count is now " + count);
		
		logger.info(messageContext.getEnvelope().toString());
		return InvocationResponse.CONTINUE;
		
	}
}
