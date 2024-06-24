package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utill.DriverConnection;

public class FBlogin extends DriverConnection {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = connect("https://www.fb.com");
		
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
		driver.findElement(By.name("login")).click();
		
		assertEquals("FB-Err", driver.getTitle());
		
		driver.navigate().back();
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		Object obj[][] = new Object[4][2];
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test123";
		
		obj[1][0] = "tecg@gmail.com";
		obj[1][1] = "tech";
		
		obj[2][0] = "abc@gmail.com";
		obj[2][1] = "abc123";
		
		obj[3][0] = "xyz@gmail.com";
		obj[3][1] = "xyz123";
		
		return obj;
	}
	
}
