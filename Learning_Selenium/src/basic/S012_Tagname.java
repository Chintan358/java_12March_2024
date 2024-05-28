package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class S012_Tagname {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.fb.com");
		
		List<WebElement> links =  driver.findElements(By.tagName("div"));
	
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
	}
}
