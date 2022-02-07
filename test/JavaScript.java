package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://en-gb.facebook.com/");
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		executor.executeScript("arguments[0].setAttribute('value','aadvik')",txtUserName);
		Object name=executor.executeScript("return arguments[0].getAttribute('value',txtUserName");
		System.out.println(name);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setAttribute('value','don@123')",txtpass);
		Object pass=executor.executeScript("return arguments[0].getAttribute('value',txtpass");
		System.out.println(pass);
	
					
}}
//WebElement txtUserName = driver.findElement(By.id("email"));
//txtUserName.sendKeys("aadvik");