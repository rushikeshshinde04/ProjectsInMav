Feature: StandardUserLogin
	@Standard_user_Login
  Scenario: Successful Login with Standard User Credentials
    When User enters Username as "standard_user" and Password as "secret_sauce"
    And Clicks on Login
    Then User reaches the Inventory Page "https://www.saucedemo.com/inventory.html"
    When User addes the "Backpack" product to cart
    When User addes the "light" product to cart
    And Goes to the Cart
    Then User reaches the Cart Page "https://www.saucedemo.com/cart.html"
    And Click on to Checkout
    Then User lands on the Checkout Page "https://www.saucedemo.com/checkout-step-one.html"
    And User enters FistName, LastName and Pincode as "UserFN","UserLN","415234"
    And User clicks on continue