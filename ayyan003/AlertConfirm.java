package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertConfirm {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");

	WebElement ConfirmAlert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	String text = ConfirmAlert.getText();
//
//		ConfirmAlert.click();
//		WebElement Confirm = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
//
//		Confirm.click();
//		Alert alert =driver.switchTo().alert();
//		alert.dismiss();
		
		Actions actions = new Actions(driver);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	WebElement btnclick = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	btnclick.click();
	Alert confrmAlert= driver.switchTo().alert();
	confrmAlert.accept();
	
		
		
		
		
}}
