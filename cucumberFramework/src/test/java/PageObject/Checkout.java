package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	WebDriver driver;
	
	public Checkout(WebDriver cdriver) {
		driver = cdriver;
		PageFactory.initElements(cdriver, this);
			
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement FirstName;
	@FindBy(xpath="//input[@id='last-name']")
	WebElement LastName;
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement PinCode;
	@FindBy(xpath="//input[@id='continue']")
	WebElement conti;
	@FindBy(xpath="//button[@id='finish']")
	WebElement finishBttn;
	
	public void enterFN(String FN) {
		FirstName.sendKeys(FN);		
	}
	public void enterLN(String LN) {
		LastName.sendKeys(LN);
	}
	public void enterPin(String PN) {
		PinCode.sendKeys(PN);
	}
	public void clickCont() {
		conti.click();
	}
	public void finsh(WebDriver cdriver) {
		finishBttn.click();
	}

}
