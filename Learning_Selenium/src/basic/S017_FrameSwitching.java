package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class S017_FrameSwitching {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.tutorialspoint.com/selenium/practice/frames.php");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frame = driver.findElement(By.xpath("//*[text()='Iframe 1']/following-sibling::iframe[1]"));
		
		driver.switchTo().frame(frame);
		
		
		
		//driver.findElement(By.linkText(" Selenium Tutorial")).click();
		String dt = driver.findElement(By.xpath("//*[text()='Selenium - Automation Practice Form']")).getText();
		System.out.println(dt);
	}
}
