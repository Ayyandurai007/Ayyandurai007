package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/accounts/login/?hl=en) login page/");
driver.manage().window().maximize();
//String title = driver.getTitle();
//System.out.println(title);
//String currentUrl = driver.getCurrentUrl();
//System.out.println(currentUrl);
//
//Thread.sleep(3000);
//WebElement txtusername = driver.findElement(By.xpath("//*[@name='username']"));
//txtusername.sendKeys("9789894561");
//WebElement txtpassword = driver.findElement(By.xpath("//*[@name='password']"));
//txtpassword.sendKeys("Aadvik143");
//		

driver.findElement(By.xpath(""));
	}

}
