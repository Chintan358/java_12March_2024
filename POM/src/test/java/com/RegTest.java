package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import repo.LoginFactory;
import repo.LoginPage;
import repo.RegPage;
import utill.DriverConnection;

public class RegTest extends DriverConnection {
	
	@Test
	public void test()
	{
		
		driver = connect();
		LoginFactory login = new LoginFactory(driver);
		login.regPage();
		
		RegPage reg = new RegPage(driver);
		reg.userFirstname("dhara");
		reg.userLastName("Kothari");
		
		
		
	}
		
}
