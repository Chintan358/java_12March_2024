package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//table[@class='layout']/tbody/tr/td/table/tbody/tr[3]/td")
	WebElement welcomeText;
	
	
	public String getWelcomText()
	{
		return welcomeText.getText();
	}
	
	
}
