package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Homework1 extends CommonMethods{
	public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", URL);
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");
		driver.findElement(By.id("sum1")).sendKeys("Hello");
		driver.findElement(By.id("sum2")).sendKeys("Hello");
		Thread.sleep(4000);
		driver.quit();
		
		
		

		
	}
	
	

}
