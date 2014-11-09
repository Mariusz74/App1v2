
/**
 * @Author: Mikhail
 */
package com.group3.domain;

import java.util.List;

import com.group3.interfaces.Deferral;
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
	List<Deferral> deferrals;
	
	
	/* (non-Javadoc)
	 * @see com.group3.interfaces.Student#addDeferral(int)
	 */
	@Override
	public void addDeferral(Deferral deferral) {
		this.deferrals.add(deferral);
	}
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
	 * @see com.group3.interfaces.Student#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
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
	 * @see com.group3.interfaces.Student#setID(java.lang.String)
	 */
	@Override
	public void setID(String iD) {
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
	 * @see com.group3.interfaces.Student#setElective(com.group3.interfaces.Module)
	 */
	@Override
	public void setElective(Module elective) {
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
	 * @see com.group3.interfaces.Student#setProgramSemester(com.group3.interfaces.ProgramSemester)
	 */
	@Override
	public void setProgramSemester(ProgramSemester programSemester) {
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
