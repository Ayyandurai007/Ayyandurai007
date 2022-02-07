package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\DriverUpdated\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("aadvik");
		String attribute = txtusername.getAttribute("value");
		System.out.println(attribute);
//		String source = driver.getPageSource();
//		System.out.println(source);
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
//		WebElement txtpassword = driver.findElement(By.id("pass"));
//		txtpassword.sendKeys("12345");
//		
//		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
//		btnlogin.click();
		
//		WebElement element = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
//		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
//		String text = element.getText();
//		System.out.println(text);
//		
		

//		driver.close();
	}
}

