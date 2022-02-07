package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mintra {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
			WebElement txtmob = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
			txtmob.sendKeys("9677261583");
			WebElement clicksubmit = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
			clicksubmit.click();
	}

}
