
/**
 * @Author: Mikhail
 */
package com.group3.domain;

import java.util.ArrayList;
import java.util.List;

import com.group3.interfaces.Semester;
import com.group3.interfaces.Program;
import com.group3.interfaces.ProgramSemester;

/**
 * @author Mikhail
 *TODO add database context
 */
public class ProgramImpl implements Program{
	List<ProgramSemester> classGroups;
	String name;
	int ID;
	
	public  ProgramImpl(String name )
	{
		//TODO implement database access
		this.name=name;
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Program#getProgramSemesters()
	 */
	@Override
	public List<ProgramSemester> getProgramSemesters() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Program#addProgramSemesters(java.util.List)
	 */
	@Override
	public void addProgramSemesters(List<ProgramSemester> classGroup) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Program#deleteProgramSemester(int)
	 */
	@Override
	public void deleteProgramSemester(int ID) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Program#setProgramSemester(com.group3.interfaces.ProgramSemester)
	 */
	@Override
	public void setProgramSemester(ProgramSemester programSem) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Program#getProgramSemester(int)
	 */
	@Override
	public ProgramSemester getProgramSemester(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Program#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Program#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Program#deleteName(java.lang.String)
	 */
	@Override
	public void deleteName(String name) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Program#getID()
	 */
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Program#setID(int)
	 */
	@Override
	public void setID(int ID) {
		// TODO Auto-generated method stub
		
	}
	

	
}
