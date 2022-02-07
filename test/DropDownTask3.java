package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//print all the text options(years)
		WebElement element = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		element.click();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.id("month"));
		Select select =new Select(element1);
		
		List<WebElement> options = select.getOptions();
		//middle month
		int a=options.size()/2;
		WebElement middle= options.get(a);
		String middlemonth = middle.getText();
		System.out.println(middlemonth);
		}}
		
		
		
	//for alternative	
//		for (int i = 0; i <options.size(); i=i+2) {
//			WebElement alter= options.get(i);
//			String altermonth = alter.getText();
//			System.out.println(altermonth);//		
		
		
	//first 5 months
//for (int i = 0; i <options.size()-7; i++) {
//	WebElement first= options.get(i);
//	String first5 = first.getText();
//	System.out.println(first5);
		

	//last 5 months
//for (int i = 7; i <options.size(); i++) {
//	WebElement last= options.get(i);
//	String last5 = last.getText();
//	System.out.println(last5);