package com.goodreads.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public boolean verifyCompleteTitle(WebDriver driver, String expectedTitle) {
		boolean verifiedTitle = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.titleIs(expectedTitle));
		return verifiedTitle;
	}

	public boolean verifyPartialTitle(WebDriver driver, String partialTitle) {
		boolean result = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.titleContains(partialTitle));
		return result;
	}

	public boolean verifyCompleteUrl(WebDriver driver, String expectedUrl) {
		boolean verifiedUrl = new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.urlToBe(expectedUrl));
		return verifiedUrl;
	}

	public boolean verifyPartialUrl(WebDriver driver, String element) {
		boolean result = new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.urlContains(element));
		return result;
	}

	public WebElement elementClickableState(WebDriver driver, WebElement element) {
		WebElement interactableElement = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(element));
		return interactableElement;
	}

	public WebElement verifyVisibility(WebDriver driver, WebElement element) {
		WebElement visibleElement = new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.visibilityOf(element));
		return visibleElement;
	}
}
