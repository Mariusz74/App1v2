
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

	public void setProgramSemesters(List<ProgramSemester> programSemester);

	public String getName();

	public void setName(String name);
	public int getID() ;

	public void setID(int iD);
	
	
	
}
