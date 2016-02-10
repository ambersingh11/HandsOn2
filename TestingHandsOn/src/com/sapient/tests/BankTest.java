package com.sapient.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.executive.BankExec;

public class BankTest {
	BankExec b=new BankExec(11122233,"amber",10000.00f);
	@Before
	public void setUp() throws Exception {
		//b=new BankExec(11122233,"amber",5656000.00f);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void constructorNotNullTest() {
		
		if(b==null)
			fail("Can not pass null values into the constructor");
	}
	@Test
	public void depositMethodReturnTest(){
		Number n=b.deposit(200.00f);
		if(!(n instanceof Float) || n.floatValue()<0.0f)
			fail("");
	}
	@Test
	public void withdrawMethodReturnTest(){
		
		if(b.withdraw(150.00f)<=0.0f)
			fail("");
	}
	@Test
	public void depositAmountTest(){
		float currBalnc=b.getBalance();
		float temp=b.deposit(200.00f);
		if(temp!=(currBalnc+200.00f))
			fail("");
	}
	@Test
	public void withdrawMethodLoopTest(){
		long a=System.currentTimeMillis();
		b.withdraw(100.00f);
		long b=System.currentTimeMillis();
		if(b-a > 100L)
			fail("");
	}
	@Test(expected=NullPointerException.class)
	public void constructorExceptionTest(){
		b=new BankExec(123423,null,78678.00f);
	}

}
