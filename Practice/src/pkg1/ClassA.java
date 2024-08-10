package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String baseurl ="https://www.youtube.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shinder\\Downloads\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\shinder\\Downloads\\chromedriver-win64\\chrome.exe");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get(baseurl);
	
		

	}

}
