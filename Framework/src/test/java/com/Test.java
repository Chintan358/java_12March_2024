package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utill.DriverConnection;

public class Test {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://formstone.it/components/dropdown/demo/");
		
		//WebDriver driver = DriverConnection.connect("https://formstone.it/components/dropdown/demo/");
		
		WebElement ele = driver.findElement(By.id("demo_multiple"));
		Select eles = new Select(ele);
		eles.selectByVisibleText("Two");
		eles.selectByVisibleText("Four");
		
	//	Actions builder = new Actions(driver);
	///	builder.click(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		ele.sendKeys("Two");
		
	}
}
