package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goodreads.genericutility.WebDriverUtility;

public class GoodReadsLoginPage {
	public WebDriver driver;

	public GoodReadsLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Sign In")
	private WebElement signInOption;

	public WebElement getSignInOption() {
		return signInOption;
	}
}
