package com.amazon.test.testitems;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.test.base.Base;
import com.amazon.test.pages.HomePage;

import org.testng.Assert;

public class HomePageTest extends Base {

	HomePage homePage;
	
	@BeforeMethod
	public void SetUp(Method method, Object[] params) {
		browserInitialization();
		homePage = new HomePage();
	}
	
	@Test(priority=1)
	public void testhomePageTitle() {
		String title = homePage.HomePageTitleSearch();
		Assert.assertTrue(title.contains("Online Shopping"));
	}
	
	@AfterMethod
	public void tearDown(Method method, Object[] params) {
		driver.quit();
	}
}
