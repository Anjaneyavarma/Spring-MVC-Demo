package com.demo.springMVC;

import java.util.HashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private HashMap<String, String> countryOptions;
	
	public Student() {
		
		countryOptions = new HashMap<String, String>();
		countryOptions.put("BR","Brazil");
		countryOptions.put("FR","France");
		countryOptions.put("IND","India");
		countryOptions.put("CN","Canada");
		
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	
}
