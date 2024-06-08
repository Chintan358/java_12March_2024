package utill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection {
	
	public static  WebDriver connect(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
