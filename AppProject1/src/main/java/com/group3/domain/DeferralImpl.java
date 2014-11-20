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
	int idStatus;
	Student Student;
	int idStudent;
	//ModuleLecturer moduleLecture;
	List<Module> module;
	int idDeferralModule;
	Lecturer lecturer;
	int idLecturer;
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
	public int getIdStatus() {
		return idStatus;
	}
	@Override
	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
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
	public int getIdStudent() {
		return idStudent;
	}
	@Override
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	@Override
	public List<Module> getModule() {
		return module;
	}
	@Override
	public void setModule(List<Module> module) {
		this.module = module;
	}
	@Override
	public int getIdDeferralModule() {
		return idDeferralModule;
	}
	@Override
	public void setIdDeferralModule(int idDeferralModule) {
		this.idDeferralModule = idDeferralModule;
	}
	@Override
	public Lecturer getLecturer() {
		return lecturer;
	}
	@Override
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
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
	public boolean isProccesed() {
		return isProccesed;
	}
	@Override
	public void setProccesed(boolean isProccesed) {
		this.isProccesed = isProccesed;
	}
}
