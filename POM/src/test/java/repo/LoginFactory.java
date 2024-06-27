package repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFactory {
	
WebDriver driver;
	
	public LoginFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement login;
	
	@FindBy(linkText = "Create new account")
	WebElement regPage;
	
	public void userEmail(String userEmail)
	{
		email.sendKeys(userEmail);
	}
	
	public void userPass(String userPass)
	{
		pass.sendKeys(userPass);
	}
	
	public void login()
	{
		login.click();
	}
	
	public void regPage()
	{
		regPage.click();
	}
	
	
	
}
