package com.codenotfound.primefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {

	private String firstName = "John";
	private String lastName = "Doe";
	private String greeting;
	private boolean professional = true;

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

	public String getGreeting() {
		this.greeting = "Hello " + firstName + " " + lastName + "!";
		return greeting;
	}

	public boolean isProfessional() {
		return professional;
	}

	public void setProfessional(boolean professional) {
		this.professional = professional;
	}
	
	public void switchState() {
		this.professional = !this.professional;
	}
	
	
}
