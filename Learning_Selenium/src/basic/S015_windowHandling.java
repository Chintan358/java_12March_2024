package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.DriverConnection;

public class S015_windowHandling {
	

	
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/browser-windows");
		
		
		String mainwindow = driver.getWindowHandle();
		//System.out.println(mainwindow);
		
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> wins = driver.getWindowHandles();
		for(String s : wins)
		{
			if(!s.equals(mainwindow))
			{
				driver.switchTo().window(s);
			}
		}
		
		String data = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(data);
		
	}
}
