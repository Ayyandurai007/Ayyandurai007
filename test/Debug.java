package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();	
			
			WebElement btn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
			
			btn.click();
			Thread.sleep(3000);
			WebElement btn1 = driver.findElement(By.name("firstname"));
			btn1.sendKeys("asj");
			
	}}

