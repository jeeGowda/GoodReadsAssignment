package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodReadsMyBookPage {
	public WebDriver driver;

	public GoodReadsMyBookPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Remove from my books']//parent::a")
	private WebElement majidHusainBookCancelOption;

	public WebElement getMajidHusainBookCancelOption() {
		return majidHusainBookCancelOption;
	}

	@FindBy(xpath = "//a[contains(@class,'profileMenu')]")
	private WebElement profileIcon;

	public WebElement getProfileIcon() {
		return profileIcon;
	}

	@FindBy(xpath = "//div[contains(@class,'siteHeader__subNav')]//child::a[(text()='Sign out')]")
	private WebElement signOutOption;

	public WebElement getSignOutOption() {
		return signOutOption;
	}
}
