package StepDefination;

import org.openqa.selenium.WebDriver;

import PageObject.CartPage;
import PageObject.Checkout;
import PageObject.InventoryPage;
import PageObject.LoginPage;
import Utilities.CommonUtls;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class stepDefinations {
	public WebDriver driver;
	public String dri;
	public CommonUtls comUtl = new CommonUtls();
	public LoginPage LogP;
	public InventoryPage InvP;
	public CartPage CP;
	public Checkout checkO;

	//@Before
	public void OpenBrowser() {
		driver = comUtl.InitDriver("IE");
		driver.get("https://www.google.co.in/");
		LogP = new LoginPage(driver);
		InvP = new InventoryPage(driver);
		CP = new CartPage(driver);
		checkO = new Checkout(driver);
	}

	//@After
	public void Quit() {
		driver.quit();
	}

	@Given("User launches {string} application")
	public void user_launches_application(String string) {

	}

	@When("User enters Username as {string} and Password as {string}")
	public void user_enters_username_as_and_password_as(String userName, String password) {
		LogP.enterUsername(userName);
		LogP.enterPassword(password);
	}

	@When("Clicks on Login")
	public void clicks_on_login() {
		LogP.clickLogin();
	}

	@Then("User navigates to Logout")
	public void user_navigates_to_logout() {
		InvP.toMenu();
	}

	@Then("Click on Logout")
	public void click_on_logout() {
		InvP.doLogout();
	}

	@Then("User reaches the Inventory Page {string}")
	public void user_reaches_the_inventory_page(String URL) {
		comUtl.URLValidation(comUtl.currentURL(), URL, "Inventory");
	}

	@When("User addes the {string} product to cart")
	public void user_addes_the_product_to_cart(String productName) {
		InvP.addItemToBag(productName);
		InvP.addtocart();
		InvP.backToInv();
	}

	@When("Goes to the Cart")
	public void goes_to_the_cart() {
		InvP.ToCart();
	}

	@Then("User reaches the Cart Page {string}")
	public void user_reaches_the_cart_page(String URL) {
		comUtl.URLValidation(comUtl.currentURL(), URL, "Cart");
	}

	@Then("User lands on the Checkout Page {string}")
	public void user_lands_on_the_checkout_page(String URL) {
		comUtl.URLValidation(comUtl.currentURL(), URL, "Checkout");
	}

	@Then("Click on to Checkout")
	public void click_on_to_checkout() {
		CP.DoCheckout();
	}

	@Then("User enters FistName, LastName and Pincode as {string},{string},{string}")
	public void user_enters_fist_name_last_name_and_pincode_as(String FN, String LN, String Pin) {
		checkO.enterFN(FN);
		checkO.enterLN(LN);
		checkO.enterPin(Pin);
	}

	@Then("User clicks on continue")
	public void user_clicks_on_continue() {
		checkO.clickCont();
	}
	
	@When("^User provides Username as (.+) Password as (.+)$")
	public void User_provides_username_and_password(String username,String Password) {
		LogP.enterUsername(username);
		LogP.enterPassword(Password);
	}

}
