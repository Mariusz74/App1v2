
/**
 * @Author: Mikhail
 */
package com.group3.test.interfaces.DAOStub;

import java.util.List;


import com.group3.interfaces.Module;

/**
 * @author Mikhail
 *
 */
public interface ModuleDAO {
	public boolean create(Module module);
	public boolean delete(String ID);
	public boolean update(Module module);
	public Module find(String ID);
	public List<Module> getAll(Module module);
}
