package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utill.DriverConnection;

public class S013_alertHandling {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://demo.automationtesting.in/Alerts.html");
		
//		driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		
		driver.findElement(By.cssSelector("ul.nav.nav-tabs>li:nth-of-type(2)>a")).click();
		driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
	}
}
