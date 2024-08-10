package Utilities;

import io.appium.java_client.AppiumDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class CommonUtls {
	WebDriver driver;

	AppiumDriver<WebElement> adriver;


	public WebDriver InitDriver(String browserName) {

		if (browserName.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.manage().window().maximize();
		}

		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public void URLValidation(String exptedURL, String actualURL, String pageName) {

		if (actualURL.equals(exptedURL)) {
			Assert.assertTrue(true);
			System.out.println("User is on the  " + pageName + " page");
		} else {
			Assert.assertTrue(false);
			System.out.println("User is not on the  " + pageName + " page");
		}

	}
	
	public String currentURL() {
		String URL=driver.getCurrentUrl();
		return URL;
	}

}
