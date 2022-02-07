package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownForLoop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dwnskills = driver.findElement(By.id("Skills"));
		Select select= new Select(dwnskills); 
		select.selectByIndex(9);
		
		List<WebElement> options = select.getOptions();
		for (WebElement element : options) {
			String data = element.getAttribute("value");
			System.out.println(data);
			
		}}}
	






//Normal loop

//		for (int i = 0; i < options.size(); i++) {
//			WebElement element = options.get(i);
//			String data = element.getText();
//			System.out.println(data);
			

