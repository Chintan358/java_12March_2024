package com;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(priority = 1)
	public void test()
	{
		System.out.println("running test1...");
	}
	
	@Test(priority = 2,enabled = false)
	public void alpha()
	{
		System.out.println("runing alpha test");
	}
	
	
	@Test(priority = 3)
	public void beta()
	{
		System.out.println("runing beta test");
	}
}
