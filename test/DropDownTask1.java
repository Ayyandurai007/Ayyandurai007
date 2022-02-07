package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	//print all the text options(years)
	WebElement element = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	element.click();
	Thread.sleep(2000);
	WebElement downday = driver.findElement(By.id("year"));
	Select select =new Select(downday);
	
//	List<WebElement> options = select.getOptions();
//	int size = options.size();
//	System.out.println(size);
//	for (int i = 0; i < options.size(); i++) {
//		WebElement element2 = options.get(i);
//		String text = element2.getText();
//		System.out.println(text);

		
}}

//attributes options for days
