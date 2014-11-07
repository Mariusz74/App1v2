/*Author:Mikhail*/

package com.group3.interfaces;

import com.group3.domain.SearchModel;

/*This is the interface that the lecturer would implement*/
public interface DeferralHandler {

	
	Deferral searchDeferral(SearchModel searchModel);
	
	/*
	 * Assign deferral object to lecturer for processing.
	 * returns an error code
	 * */
	int assignDeferral(Deferral deferral);
	
	/*Edit the the deferral image location to point
	 * from the unsigned version to the signed version*/
	int createSignedDeferral(Deferral deferral, String newAdress);
	
	/*
	 * Email Signed deferral to admission office and set the variable isProccessed to true
	 * returns error code
	 * 
	 * */
	int sendSignedDeferralToAdmission(Deferral deferral);

	
	
}

