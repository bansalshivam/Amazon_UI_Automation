package com.amazon.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.test.base.Base;
import com.amazon.test.constants.HomePageOR;

public class HomePage extends Base{

	@FindBy(id = HomePageOR.HOME_PAGE_LOGO_ID)
	WebElement title;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String HomePageTitleSearch() {
		title.click();
		return driver.getTitle();
	}
}
