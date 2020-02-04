package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class PageLoadandImplicitWait extends CommonMethods {

	public static void main(String[] args) {
		setUp("chrome", "google.com");
		//page load waits untill all elements on the page gets fully loaded
		//if element wont load within 30 seconds you will get TimeOutException
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//tellwebdriver to wait for the element before throwing NoSuchElementException
		// we need implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("wrongName")).sendKeys("iphone");
		driver.quit();
	}
}
