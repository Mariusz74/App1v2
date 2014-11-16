/*Author:  Mikhail Carino*/
package com.group3.domain;

import java.util.ArrayList;
import java.util.List;

import com.group3.interfaces.DeferralHandler;
import com.group3.interfaces.Deferral;
import com.group3.interfaces.DeferralSearchStrategy;
import com.group3.interfaces.Lecturer;

public class LecturerImpl implements Lecturer {
	String Name;
	String ID;
	List<DeferralImpl> deferralList;
	
	public LecturerImpl(String Name, String ID)
	{
		this.Name=Name;
		this.ID=ID;
		deferralList=new ArrayList<DeferralImpl>();
	}
	
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

	public Deferral searchDeferral(SearchModel searchModel) {
		DeferralSearchStrategy strat = new LecturerSearchDeferralStrategy();
		return strat.Search(searchModel);
		
	}

	public void rejectDeferral(Deferral deferral, String newAdress) {
		// TODO Auto-generated method stub
		
	}

	public String toString()
	{
		return "ID: " + this.ID + " Name: " +this.Name +"\n";
		
	}
}
