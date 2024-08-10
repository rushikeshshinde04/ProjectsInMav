package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public WebDriver driver;	

	public CartPage(WebDriver cdriver) {
		driver = cdriver;
		PageFactory.initElements(cdriver, this);
	}
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement contiShop;
	
	public void DoCheckout() {
		checkout.click();
	}
	
	public void DoContinueShopping() {
		contiShop.click();
	}

}
