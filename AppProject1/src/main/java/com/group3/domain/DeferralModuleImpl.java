// Mariusz
package com.group3.domain;

import com.group3.interfaces.DeferralModule;

public class DeferralModuleImpl implements DeferralModule {
	int id;
	int idDeferral;
	int idModule;
	
	public DeferralModuleImpl() 
	{ }

	public DeferralModuleImpl(int idDeferral, int idModule) {
		super();
		this.idDeferral = idDeferral;
		this.idModule = idModule;
	}
	@Override
	public int getId() {
		return id;
	}
	@Override
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int getIdDeferral() {
		return idDeferral;
	}
	@Override
	public void setIdDeferral(int idDeferral) {
		this.idDeferral = idDeferral;
	}
	@Override
	public int getIdModule() {
		return idModule;
	}
	@Override
	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}
	

}
