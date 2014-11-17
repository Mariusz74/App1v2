/**
 * @Author Mikhail
 * @Author Mariusz
 */
package com.group3.domain;

import java.util.List;




import com.group3.interfaces.Deferral;
import com.group3.interfaces.Lecturer;
import com.group3.interfaces.Module;
import com.group3.interfaces.Student;
import com.group3.interfaces.ModuleLecturer;


public class DeferralImpl implements Deferral{
	
	int ID;	
	String imageAddress;
	Status status;
	Student Student;	
	ModuleLecturer moduleLecture;
	//Lecturer lecturer;
	//List<Module> module;
	boolean isProccesed = false;

	@Override
	public int getID() {
		return ID;
	}
	@Override
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String getImageAddress() {
		return imageAddress;
	}
	@Override
	public void setImageAddress(String imageAddress) {
		this.imageAddress = imageAddress;
	}
	@Override
	public Status getStatus() {
		return status;
	}
	@Override
	public void setStatus(Status status) {
		this.status = status;
	}	
	@Override	
	public Student getStudent() {
		return Student;
	}
	@Override
	public void setStudent(Student student) {
		Student = student;
	}
	@Override	
	public ModuleLecturer getModuleLecture() {
		return moduleLecture;
	}
	@Override
	public void setModuleLecture(ModuleLecturer moduleLecture) {
		this.moduleLecture = moduleLecture;
	}
	
// ******************************** ? ******************************
	public boolean isProccesed() {
		return isProccesed;
	}

	public void setProccesed(boolean isProccesed) {
		this.isProccesed = isProccesed;
	}

	//public Lecturer getLecturer() {
	//	return lecturer;
	//}
	//public void setLecturer(Lecturer lecturer) {
	//	this.lecturer = lecturer;
	//}

	//public List<Module> getModule() {
	//	return module;
	//}
	//public void setModule(List<Module> module) {
	//	this.module = module;
	//}


}
