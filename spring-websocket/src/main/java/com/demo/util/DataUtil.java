package com.demo.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataUtil {

	public static final  DataUtil dataUtil = new DataUtil();
	
	private List<String> users = new ArrayList<String>();
	
	private List<String> country = new ArrayList<String>();
	
	
	private DataUtil(){
		this.users.add("Ketan Gote");
		this.users.add("Araf Karsh");
		this.users.add("Dattaram Gawas");
		this.users.add("Sagar Jadhav");
		this.users.add("Kedar Kokil");
		this.users.add("Deepali Arvind");
		this.users.add("Ankita Jain");
		this.users.add("Manisha Bodu");
		this.users.add("Rashmi Thakkar");
		this.users.add("Ashwini Agre");
		
		this.country.add("India");
		this.country.add("USA");
		this.country.add("Russia");
		this.country.add("China");
		this.country.add("Canada");
		this.country.add("Australia");		
	}
	
	public static DataUtil getInstance(){
		return dataUtil;
	}
	
	public String getUser(){
		Random rand = new Random();
	    String user = this.users.get(rand.nextInt(this.users.size()));
	    return user;
	}
	
	public String getCountry(){
		Random rand = new Random();
	    String country = this.country.get(rand.nextInt(this.country.size()));
	    return country;
	}
	
	
}
