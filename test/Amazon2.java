package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=i+phone+11&ref=nb_sb_noss");
		
		WebElement search = driver.findElement(By.xpath("//span[text()='40,999']//ancestor::div[@class='a-section']//child::h2"));
		String text = search.getText();
		System.out.println(text);
		
		
		//		search.sendKeys("apple i phone 11");
//		WebElement click = driver.findElement(By.id("nav-search-submit-button"));
		
//		WebElement price = driver.findElement(By.className("a-price-whole"));
		
//		 selectany.click();
}}
