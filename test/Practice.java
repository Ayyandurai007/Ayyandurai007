package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice{
	public static WebDriver driver;
		
	@BeforeClass
	public static void beforestart() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
 driver= new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
        }
	@AfterClass
	public static void afterend() {
		driver.quit();
		}
	@Before
	public  void before() {
		Date date= new Date();
		System.out.println("start time "+date);
				
		}
	@After
	public  void after() {
		Date date= new Date();
		System.out.println("end time "+date);
		}
	@Test
	public void test() {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("aadvik");
		
		}
	@Test
	public void test1() {
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("nisha");
		}
}