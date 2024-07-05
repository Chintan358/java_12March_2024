package main;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.LoginPage;
import utill.Base;

public class LoginTest_1 extends Base{
	
	@Test
	public void logincheck()
	{
		
		driver = connect();
		LoginPage login = new LoginPage(driver);
		login.enterEmail("mngr579586");
		login.enterPass("enUhAqy");
		login.loginclick();
		
		HomePage page = new HomePage(driver);
		String exprectedText = page.getWelcomText();
		
		assertTrue(exprectedText.contains("mngr579586"));
		
	}
}
