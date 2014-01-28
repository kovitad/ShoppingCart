package com.kovitad.action;

import com.opensymphony.xwork2.ActionSupport;

public class CompleteAction extends ActionSupport {
	public String name;
	public String surname;
	public String email;
	public String address;
	public String telephone;

	public String execute() {
		return SUCCESS;
	}
	
	public void validate()
	{
		if(getName().length() == 0)
		{
			addFieldError("name", "Name is required");
		}
		if(getSurname().length() == 0 )
		{
			addFieldError("surname", "Surname is required");
		}
		if(getEmail().length() == 0 )
		{
			addFieldError("email", "Email is required");
		}
		if(getAddress().length() == 0 )
		{
			addFieldError("address", "Address is required");
		}
		if(getTelephone().length() == 0 )
		{
			addFieldError("telephone", "Telephone is required");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
