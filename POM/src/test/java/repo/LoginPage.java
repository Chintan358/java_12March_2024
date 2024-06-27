package repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By email = By.id("email");
	By pass = By.id("pass");
	By login = By.name("login");
	
	
	public void userEmail(String userEmail)
	{
		driver.findElement(email).sendKeys(userEmail);
	}
	
	public void userPass(String userPass)
	{
		driver.findElement(pass).sendKeys(userPass);
	}
	
	public void login()
	{
		driver.findElement(login).click();
	}
	
}
