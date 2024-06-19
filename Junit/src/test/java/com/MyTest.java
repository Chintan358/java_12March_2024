package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTest {
	
	@Test
	public void test1()
	{
		System.out.println("Running test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Running test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Running test3");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("this method will run before every test");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("this method will run after every test");
	}
	
	@BeforeClass
	public static void setup()
	{
		System.out.println("setup...calling..");
	}
	
	@AfterClass
	public static void close()
	{
		System.out.println("Close..calling...");
	}
}
