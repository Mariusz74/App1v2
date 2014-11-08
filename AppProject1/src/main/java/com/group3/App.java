package com.group3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.group3.domain.DeferralImpl;
import com.group3.domain.Lecturer;
import com.group3.domain.ProgramSemesterImpl;
import com.group3.interfaces.DeferralHandler;
import com.group3.interfaces.Deferral;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
		context=new ClassPathXmlApplicationContext
                ("configuration.xml"); 
		
	/** Simple bean blank constructor **/
	ProgramSemesterImpl simpleBeanExample=(ProgramSemesterImpl)context.
              getBean("classGroup"); 
	
		System.out.println(simpleBeanExample.toString());
	
    }
}
