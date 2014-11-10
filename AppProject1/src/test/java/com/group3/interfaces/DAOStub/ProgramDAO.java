
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
	public void create(Program program);
	public void delete(int ID);
	public void update(Program program);
	public Program find(int ID);
	public List<Program> getAll();
	
}
