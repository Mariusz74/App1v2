/*Author:Mikhail*/

package com.group3.interfaces;

import com.group3.domain.SearchModel;

/*This is the interface that the lecturer would implement*/
public interface DeferralHandler {

	
	DeferralInterface searchDeferral(SearchModel searchModel);
	
	/*
	 * Assign deferral object to lecturer for processing.
	 * returns an error code
	 * */
	int assignDeferral(DeferralInterface deferral);
	
	/*Edit the the deferral image from the unsigned version to the signed version*/
	int createSignedDeferral(DeferralInterface deferral, String newAdress);
	
	/*
	 * Email Signed deferral to admission office
	 * returns error code
	 * 
	 * */
	int sendSignedDeferralToAdmission(DeferralInterface deferral);

	
}

/*test
 * test code
 * */
