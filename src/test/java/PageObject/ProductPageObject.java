package PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SatUtilities.Configuration;
import SatUtilities.Driver;

public class ProductPageObject {
	
	

	WebDriver driver = Driver.getDriver();

	public ProductPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@id='search']/span/div/h1/div/div[1]/div/div/span[3]")
	public WebElement bentoTxt;
	
	
	@FindBy (xpath ="//span[@class='a-color-state a-text-bold']")
	public WebElement kettleTxt;
	
	public void verifyBento() {
		String txt = bentoTxt.getText();
		Assert.assertTrue(txt.equals(Configuration.getProperty("expectedTxt")));
	}
	
	public void verifyKettle() {
		Assert.assertTrue(kettleTxt.getText().contains("kettle"));
	}
	
	public void verifyUrl() {
		Assert.assertTrue(driver.getCurrentUrl().equals(Configuration.getProperty("expectedurl")));
	}

}


