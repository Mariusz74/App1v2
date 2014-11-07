
/**
 * @Author Mikhail
 */
package com.group3.domain;

import java.util.List;

import com.group3.interfaces.DeferralHandler;
import com.group3.interfaces.Deferral;
import com.group3.interfaces.Module;
import com.group3.interfaces.Student;


public class DeferralImpl implements Deferral{
	String imageAddress;
	DeferralHandler lecturer;
	Student Student;
	List<Module> module;
	boolean isProccesed = false;

	public DeferralImpl(Student student)
	{
		this.Student=student;	
	}
	
	public List<Module> getModule() {
		return module;
	}
	public void setModule(List<Module> module) {
		this.module = module;
	}
	public String getImageAddress() {
		return imageAddress;
	}

	public void setImageAddress(String imageAddress) {
		this.imageAddress = imageAddress;
	}

	public DeferralHandler getAssignedDeferralHandler() {
		return lecturer;
	}

	@Override
	public int setToAssigned(DeferralHandler lecturer) {
		this.lecturer=lecturer;
		return 0;
	}
	
	@Override
	public boolean isProccesed(boolean state) {
		return this.isProccesed = state;
	}
	public boolean isProccesed() {
		return this.isProccesed;
	}
}
