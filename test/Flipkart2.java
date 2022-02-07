package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");
		WebElement selectlogin = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		selectlogin.click();
		WebElement txtusername = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		txtusername.sendKeys("aadvik");
		WebElement txtpass = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		txtpass.sendKeys("a545");
		

		
}}
