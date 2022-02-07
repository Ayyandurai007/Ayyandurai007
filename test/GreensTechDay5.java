package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTechDay5 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
WebElement seloverview = driver.findElement(By.id("overview-tab"));
Actions actions =new Actions(driver);
actions.moveToElement(seloverview).perform();
seloverview.click();

Thread.sleep(3000);
WebElement printpara = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
String text = printpara.getText();
System.out.println(text);
}}
