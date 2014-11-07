/*Author:Mikhail*/
package com.group3.interfaces;

import com.group3.domain.SearchModel;



public interface Deferral {

	/*
	 * Set itself as assigned to a lecturer
	 * */
	public DeferralHandler getAssignedDeferralHandler();
	public int setToAssigned(DeferralHandler lecturer);
	public boolean isProccesed();
	public boolean isProccesed(boolean state);
	
}
