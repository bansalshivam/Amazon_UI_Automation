package com.amazon.test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.test.base.Base;

public class TestUtility extends Base {
	
	public static String project_property(String env_key) {
		Properties env = new Properties();
		try {
			FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//amazon//test//config//project.properties");
			env.load(fileInput);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		// TODO Auto-generated constructor stub
		}
		return env.getProperty(env_key);
	}
	
	public static void captureScreenshotonException() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
}
