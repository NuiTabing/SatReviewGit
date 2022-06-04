package TestCase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.HomePageObject;
import PageObject.ProductPageObject;
import SatUtilities.Configuration;
import SatUtilities.Driver;

public class AmazonTest {
	
	WebDriver driver ;
	HomePageObject hp = new HomePageObject();
	ProductPageObject pp = new ProductPageObject();
	
	@BeforeMethod
	public void setUp() {	
		driver = Driver.getDriver();
		driver.get(Configuration.getProperty("url"));	
	}
	
	@Test
	public void SearchBentoBox() {
		hp.searchBox.sendKeys(Configuration.getProperty("item"));
		hp.searchBox.sendKeys(Keys.RETURN);
		pp.verifyUrl();
		pp.verifyKettle();
	}
	

}
