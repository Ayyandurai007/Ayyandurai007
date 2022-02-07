package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDay4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		   
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='text']"));
		txtemail.sendKeys("aadvik143");
		String data = txtemail.getAttribute("value");
		System.out.println(data);
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("prabhu");
		String data2 = txtpass.getAttribute("value");
		System.out.println(data2);
}}