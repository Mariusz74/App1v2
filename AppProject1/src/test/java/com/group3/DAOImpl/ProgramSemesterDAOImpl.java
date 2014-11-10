
/**
 * @Author: Mikhail
 */
package com.group3.DAOImpl;

import java.util.List;

import com.group3.interfaces.ProgramSemester;
import com.group3.interfaces.Module;
import com.group3.interfaces.DAOStub.ProgramSemesterDAO;

/**
 * @author Mikhail
 *
 */
public class ProgramSemesterDAOImpl implements ProgramSemesterDAO {

		List<ProgramSemester> deferrals; 
		
	public ProgramSemesterDAOImpl(List<ProgramSemester> programSemester)
	{
		this.deferrals=programSemester;
	}
	
	
	
	@Override
	public void create(ProgramSemester programSemester) {
		this.deferrals.add(programSemester);
	}

	@Override
	public void delete(int ID) {
		for(ProgramSemester def:deferrals)
		{
			if(def.getID()==ID)
			{
				this.deferrals.remove(ID);
			}
		}
	}

	@Override
	public void update(ProgramSemester programSemester) {
		int index=0;
		for(ProgramSemester def:deferrals)
		{
			if(def.getID()==programSemester.getID())
			{
				this.deferrals.set(index, programSemester);
			}
			index++;
		}
	}

	@Override
	public ProgramSemester find(int ID) {
		ProgramSemester programSemester=null;
		
		for(ProgramSemester def:deferrals)
		{
			if(def.getID()==ID)
			{
				programSemester= def;
			}
		}
		
		return programSemester;
	}

	@Override
	public List<ProgramSemester> getAll() {
		return this.deferrals;
	}

}
