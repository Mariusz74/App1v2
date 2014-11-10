
/**
 * @Author: Mikhail
 */
package com.group3.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import com.group3.interfaces.Module;
import com.group3.interfaces.DAOStub.ModuleDAO;


/**
 * @author Mikhail
 *
 */
public class ModuleDAOImpl implements ModuleDAO {

	List<Module> Modules; 
	public ModuleDAOImpl(List<Module> Module)
	{
		this.Modules=Module;
		
	}
	
	
	
	@Override
	public boolean create(Module Module) {
		return this.Modules.add(Module);
	}

	@Override
	public boolean delete(String ID) {
		for(Module def:Modules)
		{
			if(def.getID().equalsIgnoreCase(ID)==true)
			{
				this.Modules.remove(ID);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(Module Module) {
		int index=0;
		for(Module def:Modules)
		{
			if(def.getID()==Module.getID())
			{
				this.Modules.set(index, Module);
				return true;
			}
			index++;
		}
		return false;
	}

	@Override
	public Module find(String ID) {
		Module Module=null;
		
		for(Module def:Modules)
		{
			if(def.getID().equalsIgnoreCase(ID)==true)
			{
				Module= def;
			}
		}
		
		return Module;
	}

	@Override
	public List<Module> getAll(Module Module) {
		return this.Modules;
	}

}
