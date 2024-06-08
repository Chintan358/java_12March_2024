package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S001_TestDemo
{
	public static void main(String[] args) 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Chintan_work\\seleniumdata\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver", "C:\\Chintan_work\\seleniumdata\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		//opne website url
		driver.get("https://www.facebook.com/");
	
		//maximize browser
		driver.manage().window().maximize();
		
		
		
	}
}
