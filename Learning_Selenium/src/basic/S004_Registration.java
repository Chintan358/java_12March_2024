package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S004_Registration {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.linkText("Create new account")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("firstname")).sendKeys("Dhara");
		driver.findElement(By.name("lastname")).sendKeys("Kachhadiya");
		driver.findElement(By.name("reg_email__")).sendKeys("9685748596");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test123");
		
		
		WebElement day= driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("10");
		
		WebElement month= driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("6");
		
		WebElement year= driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(5);
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		//System.out.println(gender.size());
		gender.get(1).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	
	
	
	
}
