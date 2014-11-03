/*Author:Mikhail*/

package com.group3.interfaces;

/*This is the interface that the lecturer would implement*/
public interface DeferralHandlerInterface {

	/*Returns a deferral object
	 * I'm still not sure on what parameter to use as a search criteria
	 * */
	DeferralInterface searchDeferral();
	
	/*
	 * Assign deferral object to lecturer for processing.
	 * returns an error code
	 * */
	int assignDeferral(DeferralInterface deferral);
	
	/*I'm still not sure what are the parameters for this. Should it be a text representing the lcation of the image file?
	 * returns error code
	 * */
	int uploadSignedDeferral();
	
	/*
	 * Email Signed deferral to admission office
	 * returns error code
	 * */
	int sendSignedDeferralToAdmission(DeferralInterface deferral);
}
