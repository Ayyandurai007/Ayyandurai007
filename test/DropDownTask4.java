package org.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//print all the text options(years)
		WebElement element = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		element.click();
		Thread.sleep(2000);
//		WebElement element1 = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select select =new Select(year);
		
		List<WebElement> options = select.getOptions();
		List<WebElement> l = new ArrayList <>();
		 l.addAll(options);
		
		if (l.size()==options.size()) {
			System.out.println("No Duplicates");
			
		} else {
System.out.println("Duplicates");
		}
}}
