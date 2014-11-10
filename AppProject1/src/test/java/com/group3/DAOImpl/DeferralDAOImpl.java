
/**
 * @Author: Mikhail
 */
package com.group3.DAOImpl;

import java.util.List;

import com.group3.interfaces.Deferral;
import com.group3.interfaces.DAOStub.DeferralDAO;

/**
 * @author Mikhail
 *
 */
public class DeferralDAOImpl implements DeferralDAO {

	List<Deferral> deferrals; 
	public DeferralDAOImpl(List<Deferral> deferral)
	{
		this.deferrals=deferral;
	}
	
	
	
	@Override
	public boolean create(Deferral deferral) {
		return this.deferrals.add(deferral);
	}

	@Override
	public boolean delete(int ID) {
		for(Deferral def:deferrals)
		{
			if(def.getID()==ID)
			{
				this.deferrals.remove(ID);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(Deferral deferral) {
		int index=0;
		for(Deferral def:deferrals)
		{
			if(def.getID()==deferral.getID())
			{
				this.deferrals.set(index, deferral);
				return true;
			}
			index++;
		}
		return false;
	}

	@Override
	public Deferral find(int ID) {
		Deferral deferral=null;
		
		for(Deferral def:deferrals)
		{
			if(def.getID()==ID)
			{
				deferral= def;
			}
		}
		
		return deferral;
	}

	@Override
	public List<Deferral> getAll(Deferral deferral) {
		return this.deferrals;
	}

}
