package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class S008_StaticTable {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
//		WebElement data =  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]/span"));
//		System.out.println(data.getText());
		
		
//		
//		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
//		
//		for(WebElement data : allData)
//		{
//			System.out.println(data.getText());
//		}
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		for(WebElement h  : headers)
		{
			System.out.print(h.getText()+" ");
		}
		System.out.println();
		
		for(int i=2;i<=rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
			for(WebElement col  :cols)
			{
				System.out.print(col.getText()+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
