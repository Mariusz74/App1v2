
/**
 * @Author: Mikhail
 */
package com.group3.interfaces.DAOStub;

import java.util.List;

import com.group3.interfaces.Module;
import com.group3.interfaces.Program;

/**
 * @author Mikhail
 *
 */
public interface ProgramDAO {
	public boolean create(Program program);
	public boolean delete(int ID);
	public boolean update(Program program);
	public Program find(int ID);
	public List<Program> getAll();
	
}
