package com.nisum.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class A1Test {
	A1 a=null;
@BeforeEach
public void setUp()
{
	 a=new A1();
}

	@Test
	void test() {
		Integer res=a.max1(Arrays.asList(3,1,6));
		assertEquals(6,res);
	}

}