package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement selectsign = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		selectsign.click();
		WebElement txtmob = driver.findElement(By.id("mobile"));
		txtmob.sendKeys("9677261583");
	
WebElement txtname = driver.findElement(By.id("name"));
txtname.sendKeys("aadvik");
WebElement txtemail = driver.findElement(By.id("email"));
txtemail.sendKeys("aadvik@gmail.com");
WebElement txtpass = driver.findElement(By.id("password"));
txtpass.sendKeys("god143");
	}}