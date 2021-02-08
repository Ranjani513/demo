package com.nisum.main;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class A3Test {
A3 a=null;
@BeforeEach
public void setup()
{
	a=new A3();
}
	@Test
	void test() {
		List<Integer> li=Arrays.asList(0,1,1);
		
		assertEquals(li,a.fib(3));
	}
	@Test
	void test1() {
		UserException ue=assertThrows(UserException.class,()->a.fib(-1));
		assertSame("Invalid",ue.getMessage());
	}

}
