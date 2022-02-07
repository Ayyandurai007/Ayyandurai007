package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://netbanking.hdfcbank.com/");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
//		driver.switchTo().frame(0);
WebElement username = driver.findElement(By.xpath("//*[@class='form-control text-muted']"));
username.sendKeys("aadvik");
		
		
	}

}
