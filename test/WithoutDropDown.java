package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//print all the text options(years)
		WebElement element = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		element.click();
		Thread.sleep(2000);
		

//		month without using select
		WebElement month = driver.findElement(By.id("month"));
		Actions actions= new Actions(driver);
		actions.doubleClick(month).perform();
		String text = month.getText();
		System.out.println(text);
	}}	
		
		
		
		
		
		
		
//		//day month year without using select
//		WebElement day = driver.findElement(By.id("day"));
//		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));
//		Actions actions= new Actions(driver);
//		actions.doubleClick(day).perform();
//		String text = day.getText();
//		System.out.println(text);	
//		
//		actions.doubleClick(month).perform();
//		String text1 = month.getText();
//		System.out.println(text1);
//		
//		actions.doubleClick(year).perform();
//		String text2 = year.getText();
//		System.out.println(text2);
//	







//	System.out.println(text);