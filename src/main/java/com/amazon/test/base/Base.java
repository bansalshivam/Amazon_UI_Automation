package com.amazon.test.base;

import com.amazon.test.utils.TestUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {

	public static WebDriver driver;
	
	public Base() {
		
	}
	
	public static void browserInitialization() {
		String browser = TestUtility.project_property("browser");
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + TestUtility.project_property("driverPath") + TestUtility.project_property("chromeDriver"));
			driver = new ChromeDriver();	
		} else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + TestUtility.project_property("driverPath") + TestUtility.project_property("firefoxDriver"));
			driver = new FirefoxDriver();
		} else if(browser.equals("IE")) {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + TestUtility.project_property("driverPath") + TestUtility.project_property("iEDriver"));
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(TestUtility.project_property("url"));
	}
}
