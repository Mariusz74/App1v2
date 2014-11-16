
/**
 * @Author: Mikhail
 */
package com.group3.test.interfaces.DAOStub;

import java.util.List;

import com.group3.interfaces.Module;
import com.group3.interfaces.Program;
import com.group3.interfaces.ProgramSemester;

/**
 * @author Mikhail
 *
 */
public interface ProgramSemesterDAO {
	public boolean create(ProgramSemester programSemester);
	public boolean delete(int ID);
	public boolean update(ProgramSemester programSemester);
	public ProgramSemester find(int ID);
	public List<ProgramSemester> getAll();
}
