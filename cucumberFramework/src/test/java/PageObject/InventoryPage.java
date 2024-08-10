package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

	public final WebDriver driver;

	public InventoryPage(WebDriver cdriver) {
		driver = cdriver;
		PageFactory.initElements(cdriver, this);
	}
	

	@FindBy(xpath = "//button[contains(text(),'Add to cart')]//preceding::div[contains(text(),'Backpack')]")
	WebElement Backpack;
	@FindBy(xpath = "//button[contains(text(),'Add to cart')]//preceding::div[contains(text(),'Light')]")
	WebElement Light;
	@FindBy(xpath = "//button[contains(text(),'Add to cart')]//preceding::div[contains(text(),'Bolt T-Shirt')]")
	WebElement BoltTShirt;
	@FindBy(xpath = "//button[contains(text(),'Add to cart')]//preceding::div[contains(text(),'Jacket')]")
	WebElement Jacket;
	@FindBy(xpath = "//button[contains(text(),'Add to cart')]//preceding::div[contains(text(),'Onesie')]")
	WebElement Onesie;
	@FindBy(xpath = "//button[contains(text(),'Add to cart')]//preceding::div[contains(text(),'Red')]")
	WebElement Redshirt;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement hamMenu;
	@FindBy(xpath="//button[contains(text(),'Add to cart')]")
	WebElement addToCartBttn;
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logoutBttn;
	@FindBy(xpath="//button[@id='back-to-products']")
	WebElement backToProd;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cartBttn;

	public void addItemToBag(String productName) {
		if (productName.equalsIgnoreCase("backpack")) {
			Backpack.click();
		} else if (productName.equalsIgnoreCase("Light")) {
			Light.click();
		} else if (productName.equalsIgnoreCase("BoltTShirt")) {
			BoltTShirt.click();
		} else if (productName.equalsIgnoreCase("Jacket")) {
			Jacket.click();
		} else if (productName.equalsIgnoreCase("Onesie")) {
			Onesie.click();
		} else if (productName.equalsIgnoreCase("Redshirt")) {
			Redshirt.click();
		}
	}
	
	public void addtocart() {
		addToCartBttn.click();
	}
	
	public void toMenu() {
		hamMenu.click();
	}
	
	public void doLogout() {
		logoutBttn.click();
	}
	
	public void backToInv() {
		backToProd.click();
	}
	
	public void ToCart() {
		cartBttn.click();
	}

}
