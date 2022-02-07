package org.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionSoft {
	public static WebDriver driver;
	
	@Test
	public void test() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
 driver= new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
String url = driver.getCurrentUrl();
boolean b = url.contains("https://en-gb.facebook.com/");
Assert.assertTrue("verify url",b );
WebElement txtuser = driver.findElement(By.id("email"));
txtuser.sendKeys("aadvik");
String att = txtuser.getAttribute("value");
Assert.assertEquals("verify username","aadvik",att);
	}

	@Test
public void test1(){

WebElement txtpass = driver.findElement(By.id("pass"));
txtpass.sendKeys("nisha");
String att1 = txtpass.getAttribute("value");
Assert.assertEquals("verify password","nisha",att1);
}}