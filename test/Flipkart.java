package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
//		WebElement login = driver.findElement(By.xpath(";//a[@class='_1_3w1N']"));
//		login.click();
//		WebElement textemail = driver.findElement(By.xpath("((//input[@autocomplete='off'])[2])"));
//		textemail.sendKeys("aadvik");
//		WebElement textpass = driver.findElement(By.xpath("((//input[@autocomplete='off'])[3])"));
//		textpass.sendKeys("prabhu");
		


}}
