package com.verizon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.verizon.exceptions.ScoreException;
import com.verizon.service.ScoringService;

public class TestScoringServiceGetPercentage {
	private ScoringService ss;

	@Before
	public void setUp() throws Exception {
		this.ss=new ScoringService();
	}

	@After
	public void tearDown() throws Exception {
		this.ss=null;
	}

	@Test
	public void testGetPercentage() {
		int[] marks= {50,50,50};
		int maxMark=100;
		double expectedPercentage= 50;
		try {
			double actual = ss.getPercentage(marks, maxMark);
			assertEquals(expectedPercentage, actual,0.05);
		
		} catch (ScoreException e) {
			fail("Exception not to be raised in this case");
		}
		
		
		
		
	}
	

	@Test(expected=ScoreException.class)
	// to inform exception is expected
	public void testGetPercentageWithNullMarks() throws ScoreException {
		int[] marks= null;
		int maxMark=100;
		ss.getPercentage(marks, maxMark);
		fail("Expecting an exception");
		
	}
	@Test(expected=ScoreException.class)
	// to inform exception is expected
	public void testGetPercentageWithZeroMarks() throws ScoreException {
		int[] marks= {23,55,33};
		int maxMark=0;
		ss.getPercentage(marks, maxMark);
		fail("Expecting an exception");
		
	}
}
