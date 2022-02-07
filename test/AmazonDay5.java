package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDay5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("http://www.amazon.in");	

	WebElement lnkprime = driver.findElement(By.id("nav-link-prime"));
	Actions actions =new Actions(driver);
	actions.moveToElement(lnkprime).perform();

	Thread.sleep(3000);
	WebElement clickfast = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/G/31/prime/NavFlyout/TryPrime/2018/Apr/IN-Prime-PIN-TryPrime-MultiBen-Apr18-400x400._CB442254244_.jpg']"));
	clickfast.click();
}}
