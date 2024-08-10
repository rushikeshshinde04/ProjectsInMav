package com.maveric.saucedemo.utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private static WebDriver webDriverExcplictConfig() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\shinder\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.setBinary("C:\\Users\\shinder\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		return new ChromeDriver(options);
	}
	private static WebDriver webDriverImplicitConfig() {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("start-maximized");
			options.addArguments("--remote-allow-origins=*");
			return  new  ChromeDriver();	
	}
	
	public static WebDriver getDriver() {
		WebDriver driver = webDriverExcplictConfig();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		return driver;
	}
}
