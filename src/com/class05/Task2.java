package com.class05;
/*
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;


public class Task2 extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome",SYNTAX_PRACTICE_URL );
		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Iframe")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame("FrameOne");
		driver.findElement(By.linkText("Home"));
		driver.switchTo().defaultContent();
		driver.switchTo().frame("FrameTwo");
		
		WebElement logo=driver.findElement(By.xpath("//img[@class='custom-logo']"));
		System.out.println(logo.isDisplayed());
		driver.quit();
		
	
}
	
}
