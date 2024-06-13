package com;

import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

@RunWith(Parameterized.class)
public class FBLogin {
	
	String userEmail;
	String userPass;
	
	public FBLogin(String userEmail, String userPass) {
		
		this.userEmail = userEmail;
		this.userPass = userPass;
	} 
	
	static WebDriver driver =null;
	
	@BeforeClass
	public static void setUp()
	{
		 driver = DriverConnection.connect("https://www.fb.com");
	}
	
	@AfterClass
	public static void close()
	{
		driver.quit();
	}
	
	@Test
	public void login()
	{
			
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		
		email.clear();
		email.sendKeys(userEmail);
		pass.clear();
		pass.sendKeys(userPass);
		
		driver.findElement(By.name("login")).click();
		
		driver.navigate().back();
	}
	
	@Parameters
	public static List<Object[]> getData()
	{
		Object obj[][] = new Object[4][2];
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test";
	
		
		obj[1][0] = "tech@gmail.com";
		obj[1][1] = "tech";
		
		
		obj[2][0] = "abc@gmail.com";
		obj[2][1] = "abc";
		
		
		obj[3][0] = "xyz@gmial.com";
		obj[3][1] = "xyz";
		
		return Arrays.asList(obj);
	}
}
