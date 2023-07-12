package com.goodread.goodreadendtoend;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.goodreads.genericutility.BaseClass;
import com.goodreads.pomrepository.GoodReadsHomePage;
import com.goodreads.pomrepository.GoodReadsLoginPage;
import com.goodreads.pomrepository.GoodReadsMyBookPage;
import com.goodreads.pomrepository.GoodReadsSearchPage;
import com.goodreads.pomrepository.GoodReadsSignInPage;
import com.goodreads.pomrepository.GoodreadsSignInPage2;

public class GoodReadTrail extends BaseClass {
	@Test
	public void selectAndRemoveBookFromList() throws Throwable {
		webdriverUtils.implicitWait(driver);
		// System.out.println(driver.getTitle());
		Assert.assertEquals(webdriverUtils.verifyCompleteTitle(driver, "Goodreads | Meet your next favorite book"),
				true);
		Assert.assertEquals(webdriverUtils.verifyCompleteUrl(driver, "https://www.goodreads.com/"), true);
		GoodReadsLoginPage loginPage = new GoodReadsLoginPage(driver);
		loginPage.getSignInOption().click();
		Assert.assertEquals(webdriverUtils.verifyCompleteTitle(driver, "Sign in"), true);
		Assert.assertEquals(webdriverUtils.verifyCompleteUrl(driver, "https://www.goodreads.com/user/sign_in"), true);
		GoodReadsSignInPage signInPage = new GoodReadsSignInPage(driver);
		signInPage.getSignInWithEmail().click();
		Assert.assertEquals(webdriverUtils.verifyCompleteTitle(driver, "Goodreads Sign in"), true);
		Assert.assertEquals(webdriverUtils.verifyPartialUrl(driver, "https://www.goodreads.com/ap/signin"), true);
		GoodreadsSignInPage2 signInPage2 = new GoodreadsSignInPage2(driver);
		signInPage2.getEmailTextField().sendKeys(fileUtils.readDataFromProperty("email"));
		signInPage2.getPasswordTextField().sendKeys(fileUtils.readDataFromProperty("password"));
		signInPage2.getSignInButton().click();
		GoodReadsHomePage homePage = new GoodReadsHomePage(driver);
		homePage.getSaveButton().click();
		Assert.assertEquals(webdriverUtils.verifyCompleteTitle(driver, "Recent updates | Goodreads"), true);
		Assert.assertEquals(webdriverUtils.verifyCompleteUrl(driver, "https://www.goodreads.com/"), true);
		homePage.getSearchTextField().sendKeys(fileUtils.readDataFromProperty("bookname"), Keys.ENTER);
		GoodReadsSearchPage goodReadsSearchPage = new GoodReadsSearchPage(driver);
		webdriverUtils.elementClickableState(driver, goodReadsSearchPage.getMajidHusainBookWantReadButton());
		goodReadsSearchPage.getMajidHusainBookWantReadButton().click();
		goodReadsSearchPage.getMyBooksOption().click();
		GoodReadsMyBookPage myBookPage = new GoodReadsMyBookPage(driver);
		webdriverUtils.elementClickableState(driver, myBookPage.getMajidHusainBookCancelOption());
		Assert.assertEquals(webdriverUtils.verifyPartialTitle(driver, "books on Goodreads"), true);
		Assert.assertEquals(webdriverUtils.verifyPartialUrl(driver, "https://www.goodreads.com/review/list"), true);
		myBookPage.getMajidHusainBookCancelOption().click();
		driver.switchTo().alert().accept();
		myBookPage.getProfileIcon().click();
		myBookPage.getSignOutOption().click();
		Assert.assertEquals(webdriverUtils.verifyCompleteTitle(driver, "Goodreads | Meet your next favorite book"),
				true);
		Assert.assertEquals(webdriverUtils.verifyCompleteUrl(driver, "https://www.goodreads.com/"), true);
	}
}
