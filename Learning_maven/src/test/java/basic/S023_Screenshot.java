package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

import utill.DriverConnection;

public class S023_Screenshot {
	
	public static void getScreenshot(WebDriver driver, String name)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Chintan_work\\Files\\"+name+".png");
		
		try {
			Files.copy(source, dest);
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = DriverConnection.connect("https://www.fb.com");
		getScreenshot(driver, "login");
		
		driver.findElement(By.name("login")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getScreenshot(driver, "err");
		
		
	}
}
