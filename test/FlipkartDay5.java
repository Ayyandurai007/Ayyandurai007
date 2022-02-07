package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartDay5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
		btn.sendKeys("Apple i phone");
//		WebElement phone = driver.findElement(By.id("priceblock_ourprice"));

//		WebElement closex = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		closex.click();
//		
//		WebElement movehome = driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/128/128/image/ab7e2b022a4587dd.jpg?q=100']"));
//	Actions actions=new Actions(driver);
//	actions.moveToElement(movehome).perform();
//	
//	WebElement homefurni = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[6]"));
//		 homefurni.click();
//		 
//		 Thread.sleep(3000);
//		 
//	 WebElement print = driver.findElement(By.xpath("//a[contains(text(),'PADHUMAM Cotton 230 GSM Bath Towel Set')]"));
//	 String text = print.getText();
//	 System.out.println(text);
	
	
//	List<WebElement> l = driver.findElements(By.id("priceblock_ourprice"));
//		
//	for (int i = 0; i < l.size(); i++) {
//		System.out.println(l.get(i).getAttribute("title"));
//		
		
	}
	}


