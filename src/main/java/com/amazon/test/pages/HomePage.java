package com.amazon.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.test.base.Base;

public class HomePage extends Base{

	@FindBy(id = "nav-logo")
	WebElement title;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String HomePageTitleSearch() {
		return driver.getTitle();
	}
}
