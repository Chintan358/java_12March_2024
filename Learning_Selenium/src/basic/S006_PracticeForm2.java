package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S006_PracticeForm2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("tech");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("985968574");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		String myBirthYear = "1993";
		String myBirthMonth = "April";
		String myBirthDate = "29";
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myBirthMonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myBirthYear);
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));
		for(WebElement date : dates)
		{
			//System.out.println(date.getText());
			if(date.getText().equals(myBirthDate))
			{
				if(date.getAttribute("aria-label").contains(myBirthMonth))
				{
					date.click();
					break;
				}
				
			}
		}
		
		WebElement subject =  driver.findElement(By.id("subjectsContainer"));
		Actions builder =new Actions(driver);
		builder.click(subject).sendKeys("Maths").sendKeys(Keys.ENTER).build().perform();
		
		
		driver.findElement(By.xpath("//*[@for='hobbies-checkbox-1']")).click();
		
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\pc\\Downloads\\img\\bat.jpg");
		
		driver.findElement(By.id("currentAddress")).sendKeys("surat,gujarat");
		
		WebElement state = driver.findElement(By.id("state"));
		
       builder.click(state).sendKeys("Rajasthan").sendKeys(Keys.ENTER).build().perform();
       
       try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
		WebElement city = driver.findElement(By.id("city"));
		
		builder.click(city).sendKeys("Jaipur").sendKeys(Keys.ENTER).build().perform();
		
	
	}
}
