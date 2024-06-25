package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.DriverConnection;

public class Datadriven {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = DriverConnection.connect("https://www.fb.com");
		
	}
	@Test(dataProvider = "dp")
	public void test(String username, String password)
	{
		WebElement uname = driver.findElement(By.id("email"));
		uname.clear();
		uname.sendKeys(username);
		WebElement pass = 	driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys(password);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		
		ExcellReader rd = new ExcellReader("C:\\Users\\tops technologies\\Desktop\\Test.xlsx","login");
		int rows = rd.rowCount();
		int cols = rd.colCount();
		
		
		Object obj[][] = new Object[rows-1][cols];
		
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
		}
		return obj;
	}
	
}
