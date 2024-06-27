package utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection {
	
	public static WebDriver driver;
	public static  WebDriver connect()
	{
		Properties prop=null;
		
		try {
			FileInputStream fis = new FileInputStream("D:\\Chintan_Donotdelete\\workspace\\java\\Dhara\\java_12March_2024\\POM\\src\\test\\resources\\data.properties");
			 prop = new Properties();
			prop.load(fis);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Chintan_Donotdelete\\browserDriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
	
	
	
}
