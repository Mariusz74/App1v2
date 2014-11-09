/*Author:  Mikhail Carino*/
package com.group3.domain;

import java.util.ArrayList;
import java.util.List;

import com.group3.interfaces.DeferralHandler;
import com.group3.interfaces.Deferral;
import com.group3.interfaces.DeferralSearchStrategy;

public class Lecturer implements DeferralHandler{
	String Name;
	String ID;
	List<DeferralImpl> deferralList;
	
	public Lecturer(String Name, String ID)
	{
		this.Name=Name;
		this.ID=ID;
		deferralList=new ArrayList<DeferralImpl>();
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
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

	@Override
	public void rejectDeferral(Deferral deferral, String newAdress) {
		// TODO Auto-generated method stub
		
	}

	public String toString()
	{
		return "ID: " + this.ID + " Name: " +this.Name +"\n";
		
	}
}
