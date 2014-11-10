
/**
 * @Author: Mikhail
 */
package com.group3.domain;

import com.group3.interfaces.Module;

/**
 * @author Mikhail
 *
 */
public class ModuleImpl implements Module {

	String name;
	String ID;
	public String getName() {
		return name;
	}
	public void setName(String moduleName) {
		name = moduleName;
	}
	public String getID() {
		return ID;
	}
	public void setID(String moduleID) {
		ID = moduleID;
	}
	

}
