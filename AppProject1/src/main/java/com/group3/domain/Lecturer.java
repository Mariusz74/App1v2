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
	public String toString()
	{
		return "ID: " + this.ID + " Name: " +this.Name +"\n";
		
	}
	
	
	
	
	/*
	 * */
	@Override
	public int assignDeferral(Deferral deferral) {
		
		if(deferral.setToAssigned(this)==StatusCode.FailedToAssignDeferral)
		{
			return StatusCode.FailedToAssignDeferral;
		}
		else
		{
			return StatusCode.TRUE;			
		}
		
	}

	@Override
	public int createSignedDeferral(Deferral deferral, String newImageAddress) {
		DeferralImpl defferal_;
		defferal_=(DeferralImpl)deferral;
		
		//assign the newly uploaded signed form to the deferral object
		defferal_.setImageAddress(newImageAddress);
		return 0;
	}

	@Override
	public int sendSignedDeferralToAdmission(Deferral deferral) {
		
		//placeholder variable to represent email logic
		boolean emailSuccessful=true;
		
		//TODO Email logic goes here
		if(emailSuccessful==true)
		{
			
			deferral.isProccesed();
			return 1;
		}
		
		
		
		return 0;
	}


	@Override
	public Deferral searchDeferral(SearchModel searchModel) {
		DeferralSearchStrategy strat = new LecturerSearchDeferralStrategy();
		return strat.Search(searchModel);
		
	}


}
