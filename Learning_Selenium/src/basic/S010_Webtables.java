package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class S010_Webtables {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/webtables");
		
		String name = "Cierra";
		
		
		try {
			WebElement element = driver.findElement(By.xpath("//*[text()='"+name+"']"));
			
			
			driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("element not found...");
		}
	
		
	}
}
