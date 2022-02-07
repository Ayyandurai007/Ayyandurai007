package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechCourse {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement selectmodel = driver.findElement(By.xpath("(//h2[@class=\"mb-0\"])[2]"));
	selectmodel.click();
	WebElement selectmodel1 = driver.findElement(By.xpath("(//a[@title=\"Model Resume training in chennai\"])[1]"));
	selectmodel1.click();
}}
