package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trip {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/trains");
	WebElement txtfromstation = driver.findElement(By.xpath("//input[@title='From station']"));
	txtfromstation.sendKeys("chennai");

	WebElement txttostation = driver.findElement(By.xpath("//input[@title='To station']"));
	txttostation.sendKeys("salem");

	WebElement btnsearch = driver.findElement(By.xpath("//button[@type='submit']"));
	btnsearch.click();
}}
