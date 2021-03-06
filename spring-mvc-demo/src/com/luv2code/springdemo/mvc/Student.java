package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	private String favoriteLanguage;
	private LinkedHashMap<String,String> operatingSystems;
	private String OperatingSystem;	
	
	public Student() {
		
		//populate country options: used ISO country code
		
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IND", "India");
		countryOptions.put("FR", "France");
		countryOptions.put("USA", "United States");
		countryOptions.put("GRM", "Germany");
		
		operatingSystems = new LinkedHashMap<>();
		
		operatingSystems.put("WINDOWS", "Windows");
		operatingSystems.put("MAC", "MAC");
		operatingSystems.put("LINUX", "LINUX");
		
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
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getOperatingSystems() {
		return operatingSystems;
	}

	public String getOperatingSystem() {
		return OperatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}
	
	
	
}
