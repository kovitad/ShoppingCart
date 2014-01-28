package com.kovitad.action.register;

import javax.servlet.http.HttpServletRequest;




import org.apache.commons.lang.StringUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.kovitad.model.Customer;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

public class UserRegistrationAction extends ActionSupport implements ServletRequestAware{
	

	private static final long serialVersionUID = -5519953881540353053L;

	private HttpServletRequest request;
	
	private Customer customer;
	

	public String execute() throws Exception {
		
		return SUCCESS;
	}
	public void validate() {
		final String firstName = customer.getFirstName();
		if(StringUtils.isBlank(firstName)) {
			addFieldError(firstName, "First Name Required");
		}
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		
		this.request = request;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
