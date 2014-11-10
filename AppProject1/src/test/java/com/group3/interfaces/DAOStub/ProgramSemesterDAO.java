
/**
 * @Author: Mikhail
 */
package com.group3.interfaces.DAOStub;

import java.util.List;

import com.group3.interfaces.Module;
import com.group3.interfaces.Program;
import com.group3.interfaces.ProgramSemester;

/**
 * @author Mikhail
 *
 */
public interface ProgramSemesterDAO {
	public void create(ProgramSemester programSemester);
	public void delete(int ID);
	public void update(ProgramSemester programSemester);
	public ProgramSemester find(int ID);
	public List<ProgramSemester> getAll();
}