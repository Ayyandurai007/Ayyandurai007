package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//print all the text options(years)
		WebElement element = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		element.click();
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.id("month"));
		Select select =new Select(month);
		
		
		List<WebElement> l = select.getOptions();
		
		int size = l.size()-1;
		
		select.selectByIndex(size);
		System.out.println(size);
		select.selectByIndex(size);
		
	}}

//		int m= l.size()-1;
//		select.selectByIndex(m);

