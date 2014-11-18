package com.group3.domain;

import com.group3.interfaces.ModuleLecturer;
import com.group3.interfaces.ProgramSemester;
import com.group3.interfaces.ProgramSemesterModuleLecturer;

public class ProgramSemesterModuleLecturerImpl implements ProgramSemesterModuleLecturer {
	
	int id;	
	int idModuleLecturer;
	ModuleLecturer moduleLecturer;
	int IdProgramSemester;
	ProgramSemester programSemester;
	
	@Override
	public int getId() {
		return id;
	}
	@Override
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public int getIdModuleLecturer() {
		return idModuleLecturer;
	}
	@Override
	public void setIdModuleLecturer(int idModuleLecturer) {
		this.idModuleLecturer = idModuleLecturer;
	}
	
	@Override
	public ModuleLecturer getModuleLecturer() {
		return moduleLecturer;
	}
	@Override
	public void setModuleLecturer(ModuleLecturer moduleLecturer) {
		this.moduleLecturer = moduleLecturer;
	}
	
	@Override
	public int getIdProgramSemester() {
		return IdProgramSemester;
	}
	@Override
	public void setIdProgramSemester(int idProgramSemester) {
		IdProgramSemester = idProgramSemester;
	}
	
	@Override
	public ProgramSemester getProgramSemester() {
		return programSemester;
	}
	@Override
	public void setProgramSemester(ProgramSemester programSemester) {
		this.programSemester = programSemester;
	}

}
