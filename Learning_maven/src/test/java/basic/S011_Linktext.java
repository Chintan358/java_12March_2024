package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class S011_Linktext {
		public static void main(String[] args) {
			
			
			WebDriver driver = DriverConnection.connect("https://www.facebook.com/");
			
			
			//driver.findElement(By.linkText("Forgotten password?")).click();
			List<WebElement> links =   driver.findElements(By.partialLinkText("Create"));
			
			for(WebElement link : links)
			{
				System.out.println(link.getText());
			}
			
		}
}
