package utill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection {
	
	static WebDriver driver;
	public static  WebDriver connect(String url)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Chintan_Donotdelete\\browserDriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	
	
	
}
