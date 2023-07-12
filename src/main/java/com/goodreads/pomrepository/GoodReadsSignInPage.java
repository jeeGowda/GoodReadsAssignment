package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodReadsSignInPage {
	public WebDriver driver;

	public GoodReadsSignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Sign in with email')]")
	private WebElement signInWithEmail;

	public WebElement getSignInWithEmail() {
		return signInWithEmail;
	}
}
