package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("http://en-gb.facebook.com/");	
			TakesScreenshot screenshot= (TakesScreenshot)driver;
			File s = screenshot.getScreenshotAs(OutputType.FILE);
			File d= new File ("C:/Users/prabhakaran/Desktop/Java/out.png");
			FileUtils.copyFile(s, d);
		
			
			
	}

}
