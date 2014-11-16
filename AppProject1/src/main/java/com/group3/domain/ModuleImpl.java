// @author Mikhail & Mariusz

package com.group3.domain;

import com.group3.interfaces.Module;

public class ModuleImpl implements Module {

	String name;
	int ID;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String moduleName) {
		name = moduleName;
	}
	
	@Override
	public int getID() {
		return ID;
	}
	
	@Override
	public void setID(int moduleID) {
		ID = moduleID;
	}
	
}
