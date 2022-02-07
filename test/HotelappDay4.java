package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelappDay4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.adactinhotelapp.com/");
		WebElement txtemail = driver.findElement(By.id("username"));
		txtemail.sendKeys("aadvik");
		String data = txtemail.getAttribute("value");
		System.out.println(data);
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("prabhu");
		String data2 = txtpass.getAttribute("value");
		System.out.println(data2);
}}
