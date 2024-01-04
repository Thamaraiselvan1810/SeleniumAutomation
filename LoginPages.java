package org.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPages {

	private WebDriver driver;
	
	//By Locator
	private By emailInputLacator=By.name("email");
	private By passwordInputLocator=By.name("password");
	private By LoginButtonLocator=By.xpath("//input[@type='submit']");
	
	
	public LoginPages(WebDriver driver) {
		this.driver=driver;
	}
	
	//Methos action
	public void enterEmailId(String email) {
		WebElement emailInput =driver.findElement(emailInputLacator);
		emailInput.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(passwordInputLocator);
		passwordInput.sendKeys(password);
	}
	
	public void clickLoginButton() {
		
		WebElement loginbuton = driver.findElement(LoginButtonLocator);
		loginbuton.click();
		
	}
}
