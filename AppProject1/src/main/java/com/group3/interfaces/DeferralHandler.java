/*Author:Mikhail*/

package com.group3.interfaces;


/*This is the interface that the lecturer would implement*/
public interface DeferralHandler {

	public int getID();

	public void setID(int iD) ;
	
	/*
	 * Assign deferral object to lecturer for processing.
	 * returns an error code
	 * */
	public void assignDeferral(Deferral deferral);
	
	/*Edit the the deferral image location to point
	 * from the unsigned version to the signed version*/
	public void createSignedDeferral(Deferral deferral, String newAdress);
	
	/*
	 * Email Signed deferral to admission office and set the variable isProccessed to true
	 * returns error code
	 * 
	 * */
	public void rejectDeferral(Deferral deferral, String newAdress);
	
	/*
	 * reject deferralr
	 * 
	 * */
	public void sendSignedDeferralToAdmission(Deferral deferral);

	
	
	
}

