
/**
 * @Author: Mikhail
 */
package com.group3.interfaces.DAOStub;

import java.util.List;


import com.group3.interfaces.Module;

/**
 * @author Mikhail
 *
 */
public interface ModuleDAO {
	public boolean create(Module module);
	public boolean delete(int ID);
	public boolean update(Module module);
	public Module find(int ID);
	public List<Module> getAll(Module module);
}
