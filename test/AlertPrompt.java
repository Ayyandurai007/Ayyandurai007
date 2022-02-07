package org.test;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrompt {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");

		WebElement ConfirmAlert = driver.findElement(By.xpath("//a[text()='Alert with Textbox']"));
		ConfirmAlert.click();
		WebElement Confirm = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box']"));
		Thread.sleep(0);
		Confirm.click();
		Alert al =driver.switchTo().alert();

		al.sendKeys("aadvik");
		al.accept();
}}
