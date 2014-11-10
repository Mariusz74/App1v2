
/**
 * @Author: Mikhail
 */
package com.group3.DAOImpl;

import java.util.List;

import com.group3.interfaces.Program;
import com.group3.interfaces.Program;
import com.group3.interfaces.DAOStub.ProgramDAO;

/**
 * @author Mikhail
 *
 */
public class ProgramDAOImpl implements ProgramDAO {

		List<Program> deferrals; 
	public ProgramDAOImpl(List<Program> deferral)
	{
		this.deferrals=deferral;
	}
	
	
	
	@Override
	public void create(Program deferral) {
		this.deferrals.add(deferral);
	}

	@Override
	public void delete(int ID) {
		for(Program def:deferrals)
		{
			if(def.getID()==ID)
			{
				this.deferrals.remove(ID);
			}
		}
	}

	@Override
	public void update(Program deferral) {
		int index=0;
		for(Program def:deferrals)
		{
			if(def.getID()==deferral.getID())
			{
				this.deferrals.set(index, deferral);
			}
			index++;
		}
	}

	@Override
	public Program find(int ID) {
		Program deferral=null;
		
		for(Program def:deferrals)
		{
			if(def.getID()==ID)
			{
				deferral= def;
			}
		}
		
		return deferral;
	}

	@Override
	public List<Program> getAll() {
		return this.deferrals;
	}
}
