package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.DriverConnection;

public class S007_Instagram {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
			driver.findElement(By.linkText("Create new account")).click();
		} catch (Exception e) {
			driver.findElement(By.linkText("Sign up")).click();
		}
		
		
		
		
		
	}
}
