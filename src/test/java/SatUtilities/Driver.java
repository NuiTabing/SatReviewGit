package SatUtilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
public static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		
        if (driver == null) {

            switch (Configuration.getProperty("browser").toLowerCase()) {

            case "firefox":

                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "chrome":

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "safari":

                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;

            case "headless":

                // headless Driver
                break;

            }
            
        }

        return driver;
    }
	
	//close/quit browser
	public static void tearDown() {
		
		if(driver != null) {
			driver.close();
		}
		
	}


}
