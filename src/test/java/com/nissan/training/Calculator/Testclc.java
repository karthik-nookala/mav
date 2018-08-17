package com.nissan.training.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testclc {

	@Test
	public void test1() {
		Clc c=new Clc();
		assertEquals(10,c.add(5,5));
	}
	
	@Test
	public void test2() {
		Clc c=new Clc();
		assertEquals(10,c.sub(20,10));
	}
	
	@Test
	public void test3() {
		Clc c=new Clc();
		assertEquals(100,c.mult(20,5));
	}
	
	@Test
	public void test4() {
		Clc c=new Clc();
		assertEquals(2,c.divi(40,20));
	}

}
