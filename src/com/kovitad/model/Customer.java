package com.kovitad.model;

import java.io.Serializable;

public class Customer implements Serializable {
	
	
	private static final long serialVersionUID = -8140213667693318483L;
	

	private String firstName;

	private String lastName;
	
	private String email;
	
	private String telephone;

	

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
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
