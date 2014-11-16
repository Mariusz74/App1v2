
/**
 * @Author: Mikhail
 */
package com.group3.domain;


import java.util.List;




import com.group3.interfaces.Program;
import com.group3.interfaces.ProgramSemester;

/**
 * @author Mikhail
 *TODO add database context
 */
public class ProgramImpl implements Program{
	
	List<ProgramSemester> programSemesters;
	String name;
	int ID;
	
	public  ProgramImpl(String name )
	{
		
		this.name=name;
	}
	public  ProgramImpl()
	{
		
		
	}
	
	public List<ProgramSemester> getProgramSemesters() {
		return programSemesters;
	}

	public void setProgramSemesters(List<ProgramSemester> programSemesters) {
		this.programSemesters = programSemesters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	
}
