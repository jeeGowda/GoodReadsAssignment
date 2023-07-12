package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodreadsSignInPage2 {
	public WebDriver driver;

	public GoodreadsSignInPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_email")
	private WebElement emailTextField;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	@FindBy(id = "ap_password")
	private WebElement passwordTextField;

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	@FindBy(id = "signInSubmit")
	private WebElement signInButton;

	public WebElement getSignInButton() {
		return signInButton;
	}
}
