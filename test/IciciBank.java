package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://infinity.icicibank.com/corp/Login.jsp");
 driver.manage().window().maximize();
 String title = driver.getTitle();
 System.out.println(title);
 String currentUrl = driver.getCurrentUrl();
 System.out.println(currentUrl);
Thread.sleep(3000);
 WebElement userid = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
 userid.sendKeys("greens");
 WebElement txtpassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
 txtpassword.sendKeys("Aadvik143");

	}

}
