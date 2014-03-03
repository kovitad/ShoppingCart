package com.kovitad.services.axis.handler;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogHandler extends AbstractHandler {
	Logger logger = LoggerFactory.getLogger(LogHandler.class);

	@Override
	public InvocationResponse invoke(MessageContext messageContext) throws AxisFault {
		logger.info(messageContext.getEnvelope().toString());
		return InvocationResponse.CONTINUE;
	}

}
