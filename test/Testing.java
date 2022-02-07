package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	WebElement txtfirstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	txtfirstname.sendKeys("aadvik");
	WebElement txtlastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	txtlastname.sendKeys("P");
	WebElement txtemail = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
	txtemail.sendKeys("aadvik@gmail.com");
	
//	WebElement textmob = driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched']"));
//	textmob.sendKeys("9677261583");
 WebElement selectgender = driver.findElement(By.xpath("//input[@value='Male']"));
 selectgender.click();
 WebElement selecthobbies = driver.findElement(By.xpath("//input[@value='Movies']"));
 selecthobbies.click();
 WebElement btnsubmit = driver.findElement(By.xpath("//button[@type='submit']"));
 btnsubmit.click();


}}