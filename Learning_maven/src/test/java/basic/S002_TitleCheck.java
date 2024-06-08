package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S002_TitleCheck {
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "FB";
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
		
		
	}
}
