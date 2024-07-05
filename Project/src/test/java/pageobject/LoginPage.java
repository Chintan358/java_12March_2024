package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="uid")
	WebElement email;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	
	public void enterEmail(String userEmail)
	{
		email.sendKeys(userEmail);
		
	}
	
	public void enterPass(String userPass)
	{
		pass.sendKeys(userPass);
	}
	
	public void loginclick()
	{
		login.click();
	}
	 
	
	
}
