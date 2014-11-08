
/**
 * @Author: Mikhail
 */
package com.group3.domain;

import com.group3.interfaces.Module;
import com.group3.interfaces.ProgramSemester;
import com.group3.interfaces.Student;

/**
 * @author Mikhail
 *
 */
//TODO add db access
public class StudentImpl implements Student {
	String Name;
	String ID;
	Module Elective;
	ProgramSemester classgroup;
	
	
	
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#addDeferral(int)
	 */
	@Override
	public void addDeferral(int ID) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#deleteDeferral(int)
	 */
	@Override
	public void deleteDeferral(int ID) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#updateName(java.lang.String)
	 */
	@Override
	public void updateName(String name) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#getID()
	 */
	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#updateID(java.lang.String)
	 */
	@Override
	public void updateID(String iD) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#getElective(int)
	 */
	@Override
	public Module getElective(int ID) {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#updateElective(com.group3.interfaces.Module)
	 */
	@Override
	public void updateElective(Module elective) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#addElective(com.group3.interfaces.Module)
	 */
	@Override
	public void addElective(Module elective) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#deleteElective(int)
	 */
	@Override
	public void deleteElective(int ID) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#getProgramSemester()
	 */
	@Override
	public ProgramSemester getProgramSemester() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#updateProgramSemester(com.group3.interfaces.ProgramSemester)
	 */
	@Override
	public void updateProgramSemester(ProgramSemester programSemester) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#addProgramSemester(com.group3.interfaces.ProgramSemester)
	 */
	@Override
	public void addProgramSemester(ProgramSemester programSemester) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#deleteProgramSemester(int)
	 */
	@Override
	public void deleteProgramSemester(int ID) {
		// TODO Auto-generated method stub
		
	}
	
	
}
