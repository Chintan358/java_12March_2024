package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utill.DriverConnection;

public class S018_MouseEvent {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		
		WebElement i1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		
		Actions builder = new Actions(driver);
		
		
		//builder.dragAndDrop(i1, trash).build().perform();
//		for(int i=1;i<=4;i++)
//		{
//			builder.dragAndDrop(driver.findElement(By.xpath("//ul[@id='gallery']/li["+i+"]")), trash).build().perform();
//		}
		
		Action e1 =  builder.clickAndHold(i1).moveToElement(trash).build();
		
		e1.perform();
	}
}
