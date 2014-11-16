package com.group3.interfaces;

import com.group3.domain.DeferralImpl;

public interface Lecturer {
	
	//public String getName() ;
	///public void setName(String name) ;
	//public String getID() ;
	//public void setID(String iD) ;

	public int getID();
	public void setID(int iD);
	
	public String getFirstName();
	public void setFirstName(String firstName);
			
	public String getSurName();
	public void setSurName(String surName);

	public String getLogin();
	public void setLogin(String login);
		
	public String getPassword();
	public void setPassword(String password);
		
	public String getEmail();
	public void setEmail(String email);
		
	public String getAddress();
	public void setAddress(String address);
}
