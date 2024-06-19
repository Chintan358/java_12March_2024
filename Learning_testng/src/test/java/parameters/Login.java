package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.DriverConnection;

public class Login {
	
	@Parameters({"uname","pass"})
	@Test
	public void test(String username, String password)
	{
		WebDriver driver = DriverConnection.connect("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
