
/**
 * @Author: Mikhail
 */
package com.group3.interfaces.DAOStub;

import java.util.List;

import com.group3.interfaces.Module;
import com.group3.interfaces.Program;
import com.group3.interfaces.Semester;

/**
 * @author Mikhail
 *
 */
public interface SemesterDAO {
	public boolean create(Semester semester);
	public boolean delete(int ID);
	public boolean update(Semester semester);
	public Semester find(int ID);
	public List<Semester> getAll();
}
