// Mariusz
package com.group3.domain;

import com.group3.interfaces.Lecturer;
import com.group3.interfaces.Module;
import com.group3.interfaces.ModuleLecturer;

public class ModuleLecturerImpl implements ModuleLecturer {

	int id;
	int idModule;
	Module module;	
	int idLecturer;
	Lecturer lecturer;
	
	@Override
	public int getId() {
		return id;
	}
	@Override
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int getIdModule() {
		return idModule;
	}
	@Override
	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}
	@Override
	public Module getModule() {
		return module;
	}
	@Override
	public void setModule(Module module) {
		this.module = module;
	}
	@Override
	public int getIdLecturer() {
		return idLecturer;
	}
	@Override
	public void setIdLecturer(int idLecturer) {
		this.idLecturer = idLecturer;
	}
	@Override
	public Lecturer getLecturer() {
		return lecturer;
	}
	@Override
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

}
