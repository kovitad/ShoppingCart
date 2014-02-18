package com.kovitad.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public abstract class BaseApplicationAction extends ActionSupport implements SessionAware, ServletRequestAware, ServletResponseAware, Preparable{

	private static final long serialVersionUID = -3357556197882159549L;
	
	public static final String SUCCESS_SAVE = "successSave";
    public static final String SUCCESS_DELETE = "successDelete";
    public static final String NOT_FOUND = "notFound";

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected Map<String, Object> session;

  
    public void setServletRequest(HttpServletRequest hsr) {
        this.request = hsr;
    }

    public void setSession(Map<String, Object> map) {
        this.session = map;
    }

    public void setServletResponse(HttpServletResponse hsr) {
        this.response = hsr;
    }

    // Getters and Setters =====================================================
    public HttpServletRequest getServletRequest() {
        return request;
    }


}
