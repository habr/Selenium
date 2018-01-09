package com.demo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.gargoylesoftware.htmlunit.WebClient;

//import junit.framework.Test;

public class MyFirstScript {
	

	private static WebElement element;
	private static By webDriver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		
		driver.get("https://dev2.revetinc.com/");

		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		setElement(wait.until(ExpectedConditions.elementToBeClickable(By.className("linkedin-icon"))));
		
		
		
		driver.get("https://dev2.revetinc.com/join-now/simple");
		
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
		setElement(wait.until(ExpectedConditions.elementToBeClickable(By.className("linkedin-icon"))));
		
		//driver.get("https://dev2.revetinc.com/join-now/simple");
		
		//Thread.sleep(2000);		
		
		//driver.findElement(By.name("btnK")).click();
		
		//driver.get("https://dev2.revetinc.com/join-now/");
		
		driver.get("https://dev2.revetinc.com/join-now");
		
		driver.findElement(By.name("FirstName")).sendKeys("TestFirstName");
		driver.findElement(By.name("LastName")).sendKeys("TestLastName");
		driver.findElement(By.name("UserName")).sendKeys("Test@UserName.ru");
		driver.findElement(By.name("Password")).sendKeys("12345&Sa");
		driver.findElement(By.className("btn btn-primary btn-block")).click();
	}

	public static WebElement getElement() {
		return element;
	}

	public static void setElement(WebElement element) {
		MyFirstScript.element = element;
	}

	
}
