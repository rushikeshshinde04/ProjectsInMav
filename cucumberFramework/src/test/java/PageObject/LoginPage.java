package PageObject;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage{
	WebDriver driver;
	
	public  LoginPage(WebDriver cdriver) {
		driver = cdriver;
		PageFactory.initElements(cdriver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement Username;
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	@FindBy(xpath="//input[@id='login-button']")
	WebElement LoginButton;


	public void enterUsername(String user_name) {
		Username.sendKeys(user_name);
	}

	public void enterPassword(String pass_word) {
		Password.sendKeys(pass_word);
	}

	public void clickLogin() {
		LoginButton.click();
	}

}
