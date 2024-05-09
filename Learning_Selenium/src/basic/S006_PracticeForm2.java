package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S006_PracticeForm2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
//		List<WebElement> gender = driver.findElements(By.name("gender"));
//		gender.get(0).click();
		
		driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\pc\\Downloads\\img\\bat.jpg");
		}
}
