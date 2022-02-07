package org.test;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\src\\Driver latest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("iphone",Keys.ENTER);
		WebElement lnkIphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 7 (32GB) - Black']"));
		lnkIphone.click();
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> allwindowsId = driver.getWindowHandles();
		System.out.println(allwindowsId);
		for (String eachwindowId  : allwindowsId) {
			if (!parentId.equals(eachwindowId)) {
				driver.switchTo().window(eachwindowId);
				WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
				addtocart.click();
	
				//search another phone
				driver.switchTo().window(parentId);
				WebElement iphone2 = driver.findElement(By.xpath("New Apple iPhone 11 (64GB) - White"));
				iphone2.click();
				driver.close();
	//without using loop how to find child window id
//				List<String>listwindowId= new ArrayList<String>() {
//					//set -----copy files
//					listwindowId.addall(allwindowsId);	
//					
				
				}}}}
			
				
				
				
		

