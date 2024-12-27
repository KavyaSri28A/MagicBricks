package com.parameters;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotFile {
	static TakesScreenshot ss;
	static File src;
	static File dst;
	public static void clickScreenshot(WebDriver driver,String path) throws IOException {
		ss=((TakesScreenshot)driver);
		src=ss.getScreenshotAs(OutputType.FILE);
		dst=new File(System.getProperty("user.dir")+path);
		FileUtils.copyFile(src, dst);
	}
}
