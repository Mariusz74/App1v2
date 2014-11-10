
/**
 * @Author: Mikhail
 */
package com.group3;

/**
 * @author Mikhail
 *
 */
public class Config {
/*This is only a temp class until i figure out ho to use properties file*/
	
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	public String getContextName() {
		return ContextName;
	}
	public void setContextName(String contextName) {
		ContextName = contextName;
	}
	String beanName;
	String ContextName;
}
