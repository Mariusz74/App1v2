/*
 * This strategy is contains logic to search for deferral for the Lecturer Search Deferral webpage.
 * */
package com.group3.domain;

import java.util.ArrayList;
import java.util.List;

import com.group3.interfaces.Deferral;
import com.group3.interfaces.DeferralSearchStrategy;

public class LecturerSearchDeferralStrategy implements DeferralSearchStrategy{

	public List<Deferral> deferralResult;
	
	//test
	public List<Deferral> dummyData;
	
	public LecturerSearchDeferralStrategy()
	{
		deferralResult = new ArrayList<Deferral> ();

	}
	@Override
	public Deferral Search(SearchModel model) {
		// TODO add Search and DAO logic here
		
		for(Deferral def:dummyData)
		{
			
			
		}
		return null;
	}

}
