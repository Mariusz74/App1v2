
/**
 * @Author: Mikhail
 */
package com.group3.test.DAOImpl;

import java.util.List;

import com.group3.interfaces.ProgramSemester;
import com.group3.interfaces.Module;
import com.group3.test.interfaces.DAOStub.ProgramSemesterDAO;

/**
 * @author Mikhail
 *
 */
public class ProgramSemesterDAOImpl implements ProgramSemesterDAO {

		List<ProgramSemester> programSemesters; 
		
	public ProgramSemesterDAOImpl(List<ProgramSemester> programSemesters)
	{
		this.programSemesters=programSemesters;
	}
	
	
	
	@Override
	public boolean create(ProgramSemester programSemester) {
		return this.programSemesters.add(programSemester);
	}

	@Override
	public boolean delete(int ID) {
		boolean isSuccess=false;
		for(ProgramSemester def:programSemesters)
		{
			if(def.getID()==ID)
			{
				this.programSemesters.remove(ID);
				isSuccess=true;
			}
		}
		return isSuccess;
	}
	

	@Override
	public boolean update(ProgramSemester programSemester) {
		int index=0;
		boolean isSuccess=false;
		for(ProgramSemester def:programSemesters)
		{
			if(def.getID()==programSemester.getID())
			{
				this.programSemesters.set(index, programSemester);
				 isSuccess=true;
			}
			index++;
		}
		return isSuccess;
	}

	@Override
	public ProgramSemester find(int ID) {
		ProgramSemester programSemester=null;
		
		for(ProgramSemester def:programSemesters)
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
		return this.programSemesters;
	}

}
