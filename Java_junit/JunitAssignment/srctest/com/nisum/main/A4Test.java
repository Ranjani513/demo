package com.nisum.main;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A4Test {
A4 a=new A4();
	@Test
	void test() {
	boolean res=a.prime(5);
		assertTrue(res);
	}
	@Test
	void test1() {
	boolean res=a.prime(50);
		assertFalse(res);
	}

}
