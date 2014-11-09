
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

	String ModuleName;
	String ModuleID;
	public String getModuleName() {
		return ModuleName;
	}
	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}
	public String getModuleID() {
		return ModuleID;
	}
	public void setModuleID(String moduleID) {
		ModuleID = moduleID;
	}
	

}
