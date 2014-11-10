
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
	public void create(Semester semester);
	public void delete(int ID);
	public void update(Semester semester);
	public Semester find(int ID);
	public List<Semester> getAll();
}
