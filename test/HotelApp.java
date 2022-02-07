package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelApp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.adactinhotelapp.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement textprint = driver.findElement(By.xpath("//p[contains(text(),'Adactin Launches The Adactin Hotel App! ')]"));
		String text2 = textprint.getText();
		System.out.println(text2);

}}
