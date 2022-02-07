package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDay4 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement typesearch = driver.findElement(By.xpath("//input[@title='Search']"));
		typesearch.sendKeys("greens velmurugan");
		WebElement textsearch = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		textsearch.click();
		
		
}}
