package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utill.DriverConnection;

public class S020_KeyboardEvent {
	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.google.com/");
		
		WebElement search  =driver.findElement(By.name("q"));
		
		
		Actions builder = new Actions(driver);
		
		builder.click(search)
				.keyDown(Keys.SHIFT)
				.sendKeys("tops technologies")
				.keyUp(Keys.SHIFT)
				.doubleClick()
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		
	}
}
