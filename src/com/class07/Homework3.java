package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Controls” link
Click on enable button
Enter “Hello” and verify text is entered successfully
Close the browser
 */
import utils.CommonMethods;

public class Homework3 extends CommonMethods {
	public static void main(String[] args) {
		setUp("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		boolean a = driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
		System.out.println(a);
		String message=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		
		if (message.equals("Hello")) {
	
			System.out.println("TC passed");
		} else {
			System.out.println("TC failed");
		}

	}

}
