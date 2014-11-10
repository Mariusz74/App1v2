
/**
 * @Author: Mikhail
 */
package com.group3.domain;


import java.util.List;



import com.group3.interfaces.Program;
import com.group3.interfaces.ProgramSemester;
import com.group3.interfaces.DAOStub.ProgramDAO;

/**
 * @author Mikhail
 *TODO add database context
 */
public class ProgramImpl implements Program{
	private ProgramDAO programDAO;
	List<ProgramSemester> classGroups;
	String name;
	int ID;
	
	public  ProgramImpl(String name )
	{
		//TODO implement database access
		this.name=name;
	}

	@Override
	public List<ProgramSemester> getProgramSemesters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProgramSemesters(List<ProgramSemester> classGroup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProgramSemester(int ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setProgramSemester(ProgramSemester programSem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProgramSemester getProgramSemester(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setID(int ID) {
		// TODO Auto-generated method stub
		
	}
	

	
}
