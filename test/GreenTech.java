package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTech {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://greenstech.in/selenium-course-content.html");
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	WebElement select = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
	select.click();
	WebElement select1 = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
	select1.click();
	}
	

}
