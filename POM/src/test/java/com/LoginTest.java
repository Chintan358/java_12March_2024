package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import repo.LoginFactory;
import repo.LoginPage;
import utill.DriverConnection;

public class LoginTest extends DriverConnection {
	
	@Test
	public void test()
	{
		
		driver = connect();
		//LoginPage login = new LoginPage(driver);
		LoginFactory login = new LoginFactory(driver);
		login.userEmail("dhara@gmail.com");
		login.userPass("dhara123");
		login.login();
		
	}
		
}
