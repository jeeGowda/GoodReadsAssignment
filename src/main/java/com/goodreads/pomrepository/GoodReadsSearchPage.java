package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodReadsSearchPage {
	public WebDriver driver;

	public GoodReadsSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Majid Husain']//following::button[@class='wtrToRead'][1]")
	private WebElement majidHusainBookWantReadButton;

	public WebElement getMajidHusainBookWantReadButton() {
		return majidHusainBookWantReadButton;
	}

	@FindBy(xpath = "//nav[@class='siteHeader__primaryNavInline']//child::a[text()='My Books']")
	private WebElement myBooksOption;

	public WebElement getMyBooksOption() {
		return myBooksOption;
	}
}
