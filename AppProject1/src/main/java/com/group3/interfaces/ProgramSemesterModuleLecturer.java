// Mariusz
package com.group3.interfaces;

public interface ProgramSemesterModuleLecturer {
	
	public int getId();
	public void setId(int id);
	
	public int getIdModuleLecturer();
	public void setIdModuleLecturer(int idModuleLecturer);
	
	public ModuleLecturer getModuleLecturer();
	public void setModuleLecturer(ModuleLecturer moduleLecturer);
	
	public int getIdProgramSemester();
	public void setIdProgramSemester(int idProgramSemester);
	
	public ProgramSemester getProgramSemester();
	public void setProgramSemester(ProgramSemester programSemester);
}
