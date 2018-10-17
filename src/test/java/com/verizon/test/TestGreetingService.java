package com.verizon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.verizon.service.GreetingService;

public class TestGreetingService {
	
	GreetingService gs;
	

	@Before
	public void setUp() throws Exception {

	this.gs=new GreetingService();
	}


	@After
	public void tearDown() throws Exception {
		this.gs=null;
	}

	@Test
	public void testGreetForValidUserName() {
		String input ="Geetha";
		String expectedOutput="Hello Geetha";
		
		//Run the function to be tested
		GreetingService gs=new GreetingService();
		String actualOutput= gs.greet(input);
		
		//Check for test result
		assertEquals(expectedOutput, actualOutput);
	}
	@Test
	public void testGreetWithNullInput() {
		//Preparing test data
		String input =null;
		
		//Run the function to be tested
		GreetingService gs=new GreetingService();
		String actualOutput= gs.greet(input);
		
		//Check for test result
		assertNull(actualOutput);
		
	}

}
