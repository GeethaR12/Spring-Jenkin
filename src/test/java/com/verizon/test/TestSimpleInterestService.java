package com.verizon.test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import com.verizon.service.GreetingService;
import com.verizon.service.SimpleInterestService;

public class TestSimpleInterestService {
	
	private SimpleInterestService si;
	
	
	@Before
	public void setUp() throws Exception {
		this.si=new SimpleInterestService();
	}

	@After
	public void tearDown() throws Exception {
		this.si=null;
	}

	@Test
	public void testGetSimpleInterest() {
		
		double p=10000;
		double r=7;
		double t=2;
		double expectedVal=(p*r*t)/100;
		//Run the function to be tested
		si= new SimpleInterestService();
		double actualOutput= si.getSimpleInterest(p, r, t);
		
		//Check for test result
		assertEquals(expectedVal, actualOutput,0.00);
		
	}
	@Test
	public void testGetPayableAmount() {
		
		double p=10000;
		double r=7;
		double t=2;
		double expectedVal=((p*r*t)/100)+p;
		//Run the function to be tested
		si= new SimpleInterestService();
		double actualOutput= si.getPayableAmount(p, r, t);
		
		//Check for test result
		assertEquals(expectedVal, actualOutput,0.00);
		
	}

}
