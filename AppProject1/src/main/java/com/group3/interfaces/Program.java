
/**
 * @Author: Mikhail
 */
package com.group3.interfaces;

import java.util.List;

/**
 * @author Mikhail
 *
 */
public interface Program {
	
	public List<ProgramSemester> getProgramSemesters();
	public void addProgramSemesters(List<ProgramSemester> classGroup) ;
	public void deleteProgramSemester(int ID);
	public void setProgramSemester(ProgramSemester programSem);
	public ProgramSemester getProgramSemester(int ID);
	
	
	public String getName() ;
	public void setName(String name);
	public void deleteName(String name);

	public int getID() ;
	public void setID(int ID);
}
