package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDay3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp/");
		driver.manage().window().maximize();
		WebElement createacc = driver.findElement(By.xpath("(//span[@class=\"VfPpkd-vQzf8d\"])[2]"));
		createacc.click();
		WebElement selectmyself = driver.findElement(By.xpath("(//span[@class='VfPpkd-StrnGf-rymPhb-b9t22c'])[1]"));
		 selectmyself.click();
		 WebElement textname = driver.findElement(By.name("//input[@name='firstName']"));
		 textname.sendKeys("aadvik");
		 WebElement textname1 = driver.findElement(By.name("//input[@name='lastName']"));
		 textname1.sendKeys("p");
		 WebElement username = driver.findElement(By.name("//input[@name='UserName']"));
		 username.sendKeys("aadvik003");
		 WebElement textpass = driver.findElement(By.name("//input[@name='Passwd']"));
		 textpass.sendKeys("prabhu143");
		 WebElement textpass1 = driver.findElement(By.name("//input[@name='ConfirmPasswd']"));
		 textpass1.sendKeys("prabhu143");
//		 
}}
