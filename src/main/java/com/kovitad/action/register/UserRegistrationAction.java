package com.kovitad.action.register;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.stereotype.Component;

import com.kovitad.model.Customer;
import com.kovitad.model.Member;
import com.kovitad.services.MemberService;
import com.opensymphony.xwork2.ActionSupport;

@Component(value = "registerClass")
public class UserRegistrationAction extends ActionSupport implements
		ServletRequestAware {
	/**
	 * <tr>
	 * <s:textfield key="firstName" label="First Name" labelSeparator=":"
	 * labelposition="left" maxlength="255" />
	 * </tr>
	 * <tr>
	 * <s:textfield key="lastName" label="Last Name" labelSeparator=":"
	 * labelposition="left" maxlength="255" />
	 * </tr>
	 * <tr>
	 * <s:textfield key="Email" label="Email" labelSeparator=":"
	 * labelposition="left" maxlength="255" />
	 * </tr>
	 * <tr>
	 * <s:textfield key="userName" label="User Name" labelSeparator=":"
	 * labelposition="left" maxlength="255" />
	 * </tr>
	 * <tr>
	 * <s:textfield type="password" key="password" label="Password"
	 * labelSeparator=":" labelposition="left" maxlength="255" />
	 * </tr>
	 * <tr>
	 * <s:textfield key="confirmPassword" type="password"
	 * label="Confirm Password" labelSeparator=":" labelposition="left"
	 * maxlength="255" />
	 * </tr>
	 */

	@Resource
	private MemberService service;
	private String firstName;

	private String lastName;

	private String email;

	private String userName;

	private String password;

	private String confirmPassword;

	private static final long serialVersionUID = -5519953881540353053L;

	private HttpServletRequest request;

	private Customer customer;

	public String execute() throws Exception {
		Member member = new Member();
		member.setActive(true);
		member.setEmail(email);
		member.setFirstName(firstName);
		member.setLastName(lastName);
		member.setUserName(userName);
		member.setPassWord(password);
		service.register(member);
		return SUCCESS;
	}

	public void validate() {
		
		if (StringUtils.isBlank(firstName)) {
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public static void main(String[] argv){
		System.out.println("test:"+(15<<1));
		printBinaryNumber(30);
	}
	public static void printBinaryNumber(int decimalNumber) {
		StringBuilder test= new StringBuilder();
		while(decimalNumber > 0){
			test.insert(0, decimalNumber%2);
			decimalNumber = decimalNumber/2;
		}
		System.out.println(test);
		
	}
}
