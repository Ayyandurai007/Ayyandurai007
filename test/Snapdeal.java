package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.snapdeal.com/login/");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

WebElement mobNum = driver.findElement(By.xpath("//*[@id='userName']"));
mobNum.sendKeys("9677261583");
		
	}

}
