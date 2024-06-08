package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class S016_FrameSwitching {
	public static void main(String[] args) {
		
		
		WebDriver driver  =DriverConnection.connect("https://demoqa.com/frames");
		
		
//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//		System.out.println(frames.size());
		
		WebElement f = driver.findElement(By.id("frame1"));
		
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("abc");
		driver.switchTo().frame(f);
		
		String data = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(data);
		
		
	}
}
