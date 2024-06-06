package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class S021_Datepicker {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/datepicker/");
		
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("datepicker")).click();
		
		String myBirthYear = "2023";
		String myBirthMonth = "April";
		String myBirthDate = "29";
				
		
		String currentYear =  driver.findElement(By.className("ui-datepicker-year")).getText();
		
		int a = Integer.parseInt(myBirthYear);
		int b = Integer.parseInt(currentYear);
		
		while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myBirthYear))
		{	
					if(a<b)
					{
						driver.findElement(By.linkText("Prev")).click();
					}
					else
					{
						driver.findElement(By.linkText("Next")).click();
					}	
		}
		
		while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myBirthMonth))
		{	
					if(a<b)
					{
						driver.findElement(By.linkText("Prev")).click();
					}
					else
					{
						driver.findElement(By.linkText("Next")).click();
					}	
		}
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement date  :dates)
		{
			if(date.getText().equals(myBirthDate))
			{
				date.click();
				break;
			}
		}
		
		
		
	}
}
