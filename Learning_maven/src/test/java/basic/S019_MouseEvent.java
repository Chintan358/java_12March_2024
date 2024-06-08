package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utill.DriverConnection;

public class S019_MouseEvent {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement bank = driver.findElement(By.id("credit2"));
		WebElement account = driver.findElement(By.id("bank"));
		
		
		Actions builder = new Actions(driver);
		
		builder.clickAndHold(bank).moveToElement(account).release().build().perform();
		
		
	}
}
