package org.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
//		driver.findElement(By.name("password")).sendKeys("Aadvik143###");
		
//	driver.findElement(By.id("firstName")).sendKeys("Ayyandurai");
//	driver.findElement(By.id("lastName")).sendKeys("M");
//	driver.findElement(By.id("username")).sendKeys("ayyanmanik003");
//	driver.findElement(By.name("Passwd")).sendKeys("Aadvik143###");
//	driver.findElement(By.name("ConfirmPasswd")).sendKeys("Aadvik143###");
//	driver.findElement(By.className("VfPpkd-vQzf8d")).click();
//	driver.findElement(By.xpath("Your email address")).sendKeys("ayyanmanik003@gmail.com");
	
	
	}
	}


