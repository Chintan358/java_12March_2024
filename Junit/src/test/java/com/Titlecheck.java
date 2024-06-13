package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utill.DriverConnection;

public class Titlecheck {
	
	@Test
	public void test()
	{
		WebDriver driver = DriverConnection.connect("https://www.fb.com");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		
		assertEquals(expectedTitle,actualTitle);
		
	}
}
