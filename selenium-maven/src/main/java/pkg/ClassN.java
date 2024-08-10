package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=10; i++)
//			
//		{
//			System.out.println(i);
//		}
//				int i=1;
//				
//				while(i<=10) {
//					
//					System.out.println(i);
//					i++;
//				}
		 
	
	
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shinder\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\shinder\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");				
		
	}}
//C:\Users\shinder\Downloads\chromedriver-win64
		/*System.setProperty("webdriver.edge.driver", "./Drivers/EdgeDriver.exe");
	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("www,google.com");
	    */
		
		
	   /* System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("www,google.com");
	    
*/
	


