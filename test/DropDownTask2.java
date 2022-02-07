package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//print all the text options(years)
		WebElement element = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		element.click();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.id("day"));
		Select select =new Select(element1);
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println(size);
		for (WebElement element2 : options) {
			String attribute = element2.getAttribute("value");
			System.out.println(attribute);
		}
}}
