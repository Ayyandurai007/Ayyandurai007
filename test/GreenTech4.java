package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTech4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.greenstechnologys.com");
	WebElement printtext = driver.findElement(By.xpath("//u[contains(text(),'Greens Technologys Software Training Centers in Chennai')]"));
	String text = printtext.getText();
	System.out.println("Greens Technologys Software Training Centers in Chennai");
}}
