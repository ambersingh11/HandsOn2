package com.sapient.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sapient.executive.PerfectNumberGenerator;

@RunWith(Parameterized.class)

public class PerfectNumberTestbyParameters {
	private int numbers;
	
	public PerfectNumberTestbyParameters(int numbers) {
		super();
		this.numbers = numbers;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testPerfectByParam(){
		PerfectNumberGenerator obj=new PerfectNumberGenerator();
		
		boolean actual=obj.isPerfectNumber(numbers);
		assertTrue(numbers+" is not a perfect number",actual);
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data=new Object[][]{{6},{28},{33},{44}};
		return Arrays.asList(data);
	}

}
