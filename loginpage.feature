Feature: Login Functionality for opencart E-commerce Website

	As a user of the opencart website
	I want to be able to log in with my account
	So that I can access my account related features and manage my order
	
	Background: 
		Given I am on the opencart login page
  Scenario: Successful login with vallid credentials
    Given I have entered a valid username and password
    When I click on the login button
    Then I should be logged in successfully
    
  Scenario Outline: UnSuccessful login with Invalid or empty credential
    Given I have entered a Invalid "<username>" and "<password>"
    When I click on the login button
    Then I should see an error message indicating "<error_message>"
    
    
    Example: 
      | Username          | Password        | error_message                                         |
      | invalid@email.com | InvalidPassword | Warning: No match for E-mail Address and/or password. |
      | abbccc            | validpassword   | Warning: No match for E-mail Address and/or password. |
      | valid@email.com   | abbccc          | Warning: No match for E-mail Address and/or password. |
      
      
      Scenario: Naviagate into forgetten password page
      Given I click "forgetten password" link 
      Then I should redirect into password reset page