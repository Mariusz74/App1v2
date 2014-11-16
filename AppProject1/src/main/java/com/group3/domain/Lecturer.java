/*Author:  Mikhail Carino*/
package com.group3.domain;

import java.util.ArrayList;
import java.util.List;

import com.group3.interfaces.DeferralHandler;
import com.group3.interfaces.Deferral;
import com.group3.interfaces.DeferralSearchStrategy;

public class Lecturer implements DeferralHandler{
	String firstName;
	String surName;
	int ID;
	String login;
	String password;
	String email;
	String address;
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

	List<DeferralImpl> deferralList;
	
	public Lecturer(String firstName,String surName)
	{
		this.firstName=firstName;
		this.surName=surName;
		
		deferralList=new ArrayList<DeferralImpl>();
	}
	
	
	public int getID() {
		return this.ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	/*
	 * */
	@Override
	public void assignDeferral(Deferral deferral) {
		deferral.setLecturer(this);
	}

	@Override
	public void createSignedDeferral(Deferral deferral, String newImageAddress) {
		DeferralImpl defferal_;
		defferal_=(DeferralImpl)deferral;
		
		//assign the newly uploaded signed form to the deferral object
		defferal_.setImageAddress(newImageAddress);
		
		
	}

	@Override
	public void sendSignedDeferralToAdmission(Deferral deferral) {
		
		//placeholder variable to represent email logic
		boolean emailSuccessful=true;
		
		//TODO Email logic goes here
		if(emailSuccessful==true)
		{
			deferral.isProccesed();
		}
	}


	@Override
	public Deferral searchDeferral(SearchModel searchModel) {
		DeferralSearchStrategy strat = new LecturerSearchDeferralStrategy();
		return strat.Search(searchModel);
		
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String lecturerlogin) {
		this.login = lecturerlogin;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String lecturerpassword) {
		this.password = lecturerpassword;
	}


	public List<DeferralImpl> getDeferralList() {
		return deferralList;
	}


	public void setDeferralList(List<DeferralImpl> deferralList) {
		this.deferralList = deferralList;
	}


	@Override
	public void rejectDeferral(Deferral deferral, String newAdress) {
		// TODO Auto-generated method stub
		
	}

	public String toString()
	{
		return "ID: " + this.ID + " Name: " +this.firstName +"\n";
		
	}
}
