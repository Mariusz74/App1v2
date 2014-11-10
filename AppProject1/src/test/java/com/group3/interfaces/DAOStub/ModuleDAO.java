
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
	public void create(Module module);
	public void delete(String ID);
	public void update(Module module);
	public Module find(String ID);
	public List<Module> getAll(Module module);
}
