package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\prabhakaran\\eclipse-workspace\\SeleniumTaskDay2\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
WebElement txtusername = driver.findElement(By.id("email"));
txtusername.sendKeys("greens");
WebElement txtpassword = driver.findElement(By.id("pass"));
txtpassword.sendKeys("Aadvik143");
		
	}
}		
		
			
			

//
//QUESTIONS(Practical)
//--------------------
//QUESTION 1
//----------
//URL : https://www.facebook.com/ 
//
//NOTE: Enter Email or Phone and Password.
//
//QUESTION 2
//----------
//URL : https://www.redbus.in/ 
//
//NOTE: Enter from and to textbox.
//
//QUESTION 3
//----------
//URL : https://www.google.com/
//
//NOTE: Enter GreensTechnology. 
//               
//QUESTION 4
//----------
//URL : https://infinity.icicibank.com/corp/Login.jsp
//
//NOTE: Enter username and password. 
//
//QUESTION 5
//----------
//URL : https://netbanking.hdfcbank.com/ 
//
//NOTE: Enter customer id .
//
//QUESTION 6
//----------
//URL : https://www.swiggy.com/
//
//NOTE: Enter the location.
//
//QUESTION 7
//----------
//URL :https://www.snapdeal.com/login
//
//NOTE: Enter mobile number/email.
//
//QUESTION 8
//-----------
//URL : https://www.instagram.com/accounts/login/?hl=en) login page 
//
//NOTE: Enter username and password. 
//
//QUESTION 9
//-----------
//URL : http://demo.automationtesting.in/Register.html
//
//NOTE: Just enter the values for the textbox only.
//
//QUESTION 10
//-----------
//URL : http://adactinhotelapp.com/
//
//NOTE: Enter Email or Phone and Password.