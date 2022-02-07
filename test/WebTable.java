package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\prabhakaran\\\\eclipse-workspace\\\\SeleniumTaskDay2\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");

		//london corresponding values

		List<WebElement> Row = driver.findElements(By.tagName("tr"));
	
			
						
				WebElement element = Row.get(2);
				System.out.println(element.getText());

				List<WebElement> tData = element.findElements(By.tagName("td"));

				WebElement l = tData.get(2);

				System.out.println(l.getText());
			
		
			
		
					
		}}
			
//		2nd row 2nd data
//		List<WebElement> Row = driver.findElements(By.tagName("tr"));
//			for (int i = 1; i <Row.size() ; i++) {
//							
//				WebElement element = Row.get(i);
//
//				List<WebElement> tData = element.findElements(By.tagName("td"));
//
//				WebElement l = tData.get(2);
//
//				System.out.println(l.getText());
				
		
	










		//no of rows in webtable
		//		List<WebElement> Row = driver.findElements(By.tagName("tr"));
		//		int size = Row.size();
		//		System.out.println(size);

		//		//no of datas in webtable
		//		List<WebElement> Data = driver.findElements(By.tagName("td"));
		//		int len = Data.size();
		//		System.out.println(len);
		//		for (WebElement x : Data) {
		//			String text = x.getText();
		//			System.out.println(text);

		//1st row and 2nd data
		//		List<WebElement> Row = driver.findElements(By.tagName("tr"));
		//				for (int i = 0; i <Row.size() ; i++) {
		//					
		//					WebElement element = Row.get(i);
		//					
		//					List<WebElement> Data = driver.findElements(By.tagName("td"));
		//					for (int i1 = 0; i <Data.size() ; i++) {
		//						
		//						WebElement tData = Data.get(i);
		//						String text = tData.getText();
		//						System.out.println(text);


			
	
		
		
	
