/*Author:Mikhail
 * Contains atributes from  "Lecturer Search deferral" webpage
 * */
package com.group3.domain;

import com.group3.interfaces.Model;

public class SearchModel implements Model {

	String StudentName;
	String StudentID;
	String ProgramName;
	String ProgramID;
	String ModuleID;
	String ModuleName;
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getProgramName() {
		return ProgramName;
	}
	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	public String getProgramID() {
		return ProgramID;
	}
	public void setProgramID(String programID) {
		ProgramID = programID;
	}
	public String getModuleID() {
		return ModuleID;
	}
	public void setModuleID(String moduleID) {
		ModuleID = moduleID;
	}
	public String getModuleName() {
		return ModuleName;
	}
	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}
}
