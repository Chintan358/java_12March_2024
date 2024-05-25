package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utill.DriverConnection;

public class S009_WebTable {
	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConnection.connect("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		
		List<WebElement> header = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		
		for(WebElement hd : header)
		{
			System.out.print(hd.getText()+" ");
		}
		System.out.println();
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		
		for(int i=1;i<=rows.size();i++)
		{
			String d =  driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th")).getText();
			System.out.print(d+" ");
			List<WebElement> cols = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/td"));
			for(WebElement col: cols)
			{
				System.out.print(col.getText()+" ");
			}
			System.out.println();
		}
	
		
		String f_h =  driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th")).getText();
		String f_d =  driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td")).getText();
		System.out.println(f_h+" "+f_d);
	}
}
