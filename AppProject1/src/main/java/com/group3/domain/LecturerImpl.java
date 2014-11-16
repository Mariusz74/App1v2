/*Author:  Mikhail Carino*/
package com.group3.domain;

import java.util.ArrayList;
import java.util.List;


import com.group3.interfaces.Deferral;
import com.group3.interfaces.Lecturer;

public class LecturerImpl implements Lecturer {
	//String Name;
	//String ID;
	List<DeferralImpl> deferralList;
	int ID;
	String firstName;
	String surName;
	String login;
	String password;
	String email;
	String address;
	public LecturerImpl()
	{
	}	
	/*
	public LecturerImpl(String firstName, int ID)
	{
		this.firstName=firstName;
		this.ID=ID;
		deferralList=new ArrayList<DeferralImpl>();
	}
	*/
	public LecturerImpl(String firstName, String surName)
	{
		this.firstName=firstName;
		this.surName=surName;
		
		deferralList=new ArrayList<DeferralImpl>();
	}
	/*
	@Override
	public String getName() {
		return Name;
	}
	
	@Override
	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public String getID() {
		return ID;
	}
	
	@Override
	public void setID(String iD) {
		ID = iD;
	}
	*/
	
	@Override
	public int getID() {
		return ID;
	}

	@Override
	public void setID(int iD) {
		ID = iD;
	}	
		
	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getSurName() {
		return surName;
	}

	@Override
	public void setSurName(String surName) {
		this.surName = surName;
	}

	@Override
	public String getLogin() {
		return login;
	}

	@Override
	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}
	//public void assignDeferral(Deferral deferral) {
	//	deferral.setLecturer(this);
	//}

	public void createSignedDeferral(Deferral deferral, String newImageAddress) {
		DeferralImpl defferal_;
		defferal_=(DeferralImpl)deferral;
		
		//assign the newly uploaded signed form to the deferral object
		defferal_.setImageAddress(newImageAddress);
	}

	public void sendSignedDeferralToAdmission(Deferral deferral) {
		
		//placeholder variable to represent email logic
		boolean emailSuccessful=true;
		
		//TODO Email logic goes here
		if(emailSuccessful==true)
		{
			deferral.isProccesed();
		}
	}



	public void rejectDeferral(Deferral deferral, String newAdress) {
		// TODO Auto-generated method stub
		
	}

	public String toString()
	{
		return "ID: " + this.ID + " Name: " +this.firstName +"\n";
		
	}
}
