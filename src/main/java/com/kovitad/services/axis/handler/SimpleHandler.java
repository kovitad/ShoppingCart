package com.kovitad.services.axis.handler;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.handlers.AbstractHandler;

public class SimpleHandler extends AbstractHandler{

	@Override
	public InvocationResponse invoke(MessageContext mc) throws AxisFault {
		// TODO Auto-generated method stub
		
		return InvocationResponse.CONTINUE;
	}

}
