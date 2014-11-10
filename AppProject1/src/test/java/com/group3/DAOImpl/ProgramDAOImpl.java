
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

		List<Program> programs; 
	public ProgramDAOImpl(List<Program> programs)
	{
		this.programs=programs;
	}
	
	
	
	//@Override
	public boolean create(Program programs) {
		
		return this.programs.add(programs);
		
	}

	@Override
	public boolean delete(int ID) {
		
		boolean isSuccess=false;
		for(Program def:programs)
		{
			if(def.getID()==ID)
			{
				this.programs.remove(def);
				
				isSuccess=true;
				break;
			}
		}
		return isSuccess;
	}

	@Override
	public boolean update(Program programs) {
		int index=0;
		boolean isSuccess=false;
		for(Program def:this.programs)
		{
			if(def.getID()==programs.getID())
			{
				this.programs.set(index, programs);
				isSuccess=true;
			}
			index++;
		}
		return isSuccess;
	}

	@Override
	public Program find(int ID) {
		Program programs=null;
		
		for(Program def:this.programs)
		{
			if(def.getID()==ID)
			{
				programs= def;
			}
		}
		
		return programs;
	}

	@Override
	public List<Program> getAll() {
		return this.programs;
	}
}
