package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SatUtilities.Driver;

public class HomePageObject {
	
	WebDriver driver = Driver.getDriver();

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "twotabsearchtextbox")
	public WebElement searchBox;

}
