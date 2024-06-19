package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Payment {
	
	@Test(groups ="smoke")
	public void creditCard()
	{
		System.out.println("credit card payment");
	}
	
	@Test(groups = "sanity")
	public void debitCard()
	{
		System.out.println("debitcard Payment");
	}
	
	@Test
	public void upi()
	{
		System.out.println("UPi payment");
	}
	
//	@BeforeMethod
//	public void before()
//	{
//		System.out.println("runing before every method");
//	}
//	
//	@AfterMethod
//	public void after()
//	{
//		System.out.println("runing after every method");
//	}
//	
//	@BeforeClass
//	public void beforeclass()
//	{
//		System.out.println("Runing before class");
//	}
//	
//	@AfterClass
//	public void afterclass()
//	{
//		System.out.println("runing after class");
//	}
//	
//	@BeforeTest
//	public void beforetest()
//	{
//		System.out.println("Runing before test");
//	}
//	
//	@AfterTest
//	public void aftertest()
//	{
//		System.out.println("runing after test");
//	}
//	
//	@BeforeSuite
//	public void beforesuit()
//	{
//		System.out.println("Runing before suit");
//	}
//	
//	@AfterSuite
//	public void aftersuit()
//	{
//		System.out.println("runing after suit");
//	}
}
