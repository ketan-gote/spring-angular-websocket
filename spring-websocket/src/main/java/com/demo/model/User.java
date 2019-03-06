package com.demo.model;

import java.util.Date;

public class User {

	private String name;
	
	private String country;
	
	private String action;

	private Date date;
	
	public User(String name, String country, String action) {
		super();
		this.date = new Date();
		this.name = name;
		this.country = country;
		this.action = action;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
 
	
	 
		
}
