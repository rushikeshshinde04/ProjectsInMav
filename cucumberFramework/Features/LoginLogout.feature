Feature: Login and Logout
@Test_with_examples   
Scenario Outline: User LogIn and LogsOut
    When User provides Username as <username> Password as <password>
    And Clicks on Login
    Then User reaches the Inventory Page "https://www.saucedemo.com/inventory.html"
    And User navigates to Logout
    And Click on Logout
    
Examples: 
	|username|password|
	|standard_user|secret_sauce|
	|problem_user|secret_sauce|
 