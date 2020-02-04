package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task1 extends CommonMethods {
/*
 *TC 1: Verify element is present
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser


 */
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome","https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dynamic Loading']")).click();	
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));

		boolean text=driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		if(text) {
			System.out.println("TC is passed");
		}else {
			System.out.println("TC is failed");
		}
		Thread.sleep(2000);
		driver.quit();
		
	}
}
