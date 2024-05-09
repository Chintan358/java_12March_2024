package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S005_PracticeForm {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(0).click();
		
		List<WebElement> exp = driver.findElements(By.name("exp"));
		exp.get(0).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("10/12/2023");
		
		List<WebElement> pro = driver.findElements(By.name("profession"));
		pro.get(0).click();
		
		List<WebElement> tool = driver.findElements(By.name("tool"));
		pro.get(0).click();
		pro.get(1).click();
		
		}
}
