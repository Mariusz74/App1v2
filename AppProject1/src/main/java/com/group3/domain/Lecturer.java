/*Author:  Mikhail Carino*/
package com.group3.domain;

import com.group3.interfaces.DeferralHandler;
import com.group3.interfaces.DeferralInterface;
import com.group3.interfaces.DeferralSearchStrategy;

public class Lecturer implements DeferralHandler{


	/*
	 * */
	@Override
	public int assignDeferral(DeferralInterface deferral) {
		
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
	public int createSignedDeferral(DeferralInterface deferral, String newImageAddress) {
		Deferral defferal_;
		defferal_=(Deferral)deferral;
		
		//assign the newly uploaded signed form to the deferral object
		defferal_.setImageAddress(newImageAddress);
		return 0;
	}

	@Override
	public int sendSignedDeferralToAdmission(DeferralInterface deferral) {
		//TODO Email logic goes here
		return 0;
	}


	@Override
	public DeferralInterface searchDeferral(SearchModel searchModel) {
		DeferralSearchStrategy strat = new LecturerSearchDeferralStrategy();
		return strat.Search(searchModel);
		
	}


}
