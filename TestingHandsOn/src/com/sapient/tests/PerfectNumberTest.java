package com.sapient.tests;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.executive.PerfectNumberGenerator;

public class PerfectNumberTest {
	PerfectNumberGenerator pg;
	@Before
	public void setUp() throws Exception {
		pg=new PerfectNumberGenerator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=IllegalArgumentException.class)
	public void testIsPrefectNumber() {
		Boolean b=pg.isPerfectNumber(-6);
		if(b.getClass()!=Boolean.class)
			fail("");
			
		
	}
	@Test
	public void testPrintPerfectNumbers1(){
		Set<?> lst=pg.printPerfectNumbers(100);
		if(!(lst instanceof HashSet<?>))
			fail("");
	}
	@Test
	public void testPrintPerfectNumbers2(){
		Set<Integer> lst=pg.printPerfectNumbers(100);
		for(Integer in:lst)
			if(in>100)
				fail("");
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testPrintPerfectNumbers3() {
		Set<Integer> lst=pg.printPerfectNumbers(-200);
		
	}
	
	
	

}
