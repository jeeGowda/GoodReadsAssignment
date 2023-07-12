package com.goodreads.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodReadsHomePage {
	public WebDriver driver;

	public GoodReadsHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	public WebElement getSaveButton() {
		return saveButton;
	}

	@FindBy(xpath = "//div[(@class='siteHeader__contents')]/descendant::input[contains(@class,'searchBox__input')]")
	private WebElement searchTextField;

	public WebElement getSearchTextField() {
		return searchTextField;
	}
}
