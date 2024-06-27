package repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage {
	
WebDriver driver;
	
	public RegPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="firstname")
	WebElement fname;
	@FindBy(name="lastname")
	WebElement lname;
	
	
	public void userFirstname(String userFname)
	{
		fname.sendKeys(userFname);
	}
	
	public void userLastName(String userLname)
	{
		lname.sendKeys(userLname);
	}
}
