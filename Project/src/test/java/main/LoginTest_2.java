package main;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.LoginPage;
import utill.Base;
import utill.ExcellReader;

public class LoginTest_2 extends Base{
	
	@Test(dataProvider = "dp")
	public void logincheck(String uname,String pass,String expectedtitle)
	{
		
		driver = connect();
		LoginPage login = new LoginPage(driver);
		login.enterEmail(uname);
		login.enterPass(pass);
		login.loginclick();
		
		try
		{
			Alert alert =  driver.switchTo().alert();
			String text = alert.getText();
			alert.accept();
			assertEquals(text, expectedtitle);
			
		} 
		catch (Exception e)
		{
			HomePage page = new HomePage(driver);
			String exprectedText = page.getWelcomText();
			
			assertTrue(exprectedText.contains(uname+"1"));
		}
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		
		ExcellReader rd = new ExcellReader("C:\\Users\\pc\\Desktop\\Test\\test.xlsx","login");
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
