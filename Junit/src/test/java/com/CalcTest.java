package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
	
	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int actualResult =  c.add(10, 20);
		int expectedResult = 30;
		
		assertEquals(expectedResult, actualResult);
	}
}
