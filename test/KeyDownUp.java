package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownUp {
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Actions actions =new Actions(driver);
		WebElement txtUserName = driver.findElement(By.id("email"));
		actions.keyDown(Keys.SHIFT).sendKeys(txtUserName,"aadvik").keyUp(Keys.SHIFT).perform();
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);;
	WebElement txtpass = driver.findElement(By.id("pass"));
	actions.keyDown(Keys.SHIFT).sendKeys(txtpass,"welcome").keyUp(Keys.SHIFT).perform();
}}
