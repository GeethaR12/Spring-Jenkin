package com.verizon.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.verizon.model.Grade;
import com.verizon.service.ScoringService;

@RunWith(Parameterized.class)
public class TestScoringServiceGetGrade {
	
	private double inputAvg;
	private Grade expectedGrade;
	private ScoringService sc;
	
	public TestScoringServiceGetGrade(double inputAvg, Grade expectedGrade) {
		super();
		this.inputAvg = inputAvg;
		this.expectedGrade = expectedGrade;
	}

	@Parameters
	public static Collection testData() {
		Object[][] data= {
				{94,Grade.A},
				{85,Grade.B},
				{71,Grade.C},
				{19,Grade.F}
		};
		return Arrays.asList(data);
	}
	
	@Before
	public void setUp() throws Exception {
		this.sc=new ScoringService();
	}

	@After
	public void tearDown() throws Exception {
		this.sc=null;
	}
	@Test
	public void testGetGrade() {
		assertEquals(expectedGrade,sc.getGrade(inputAvg));
		
	}

	/*
	@Test
	public void testGetGradeA() {
		assertEquals(Grade.A, sc.getGrade(100));
		
	}
	@Test
	public void testGetGradeB() {
		assertEquals(Grade.B, sc.getGrade(83));
	}
	@Test
	public void testGetGradeC() {
		assertEquals(Grade.C, sc.getGrade(71));
	}
	@Test
	public void testGetGradeF() {
		assertEquals(Grade.F, sc.getGrade(19));
	}*/

}
