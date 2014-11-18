package com.group3.test.dbUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;



@ContextConfiguration("classpath:crudTestConfig.xml")
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,DbUnitTestExecutionListener.class })

public class emptyTest {

	@Test
	@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
	public void create() {
		//
		
		assertNotNull(null);
	}
	
}
