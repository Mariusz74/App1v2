
/**
 * @Author Mikhail
 */
package com.group3.domain;

import java.util.List;


import com.group3.interfaces.Deferral;
import com.group3.interfaces.Lecturer;
import com.group3.interfaces.Module;
import com.group3.interfaces.Student;


public class DeferralImpl implements Deferral{
	String imageAddress;
	Lecturer lecturer;
	Student Student;
	List<Module> module;
	Status status;
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	boolean isProccesed = false;
	int ID;
	
	public String getImageAddress() {
		return imageAddress;
	}
	public void setImageAddress(String imageAddress) {
		this.imageAddress = imageAddress;
	}
	public Lecturer getLecturer() {
		return lecturer;
	}
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	public Student getStudent() {
		return Student;
	}
	public void setStudent(Student student) {
		Student = student;
	}
	public List<Module> getModule() {
		return module;
	}
	public void setModule(List<Module> module) {
		this.module = module;
	}
	public boolean isProccesed() {
		return isProccesed;
	}
	public void setProccesed(boolean isProccesed) {
		this.isProccesed = isProccesed;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
}
