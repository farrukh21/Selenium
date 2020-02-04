package com.class07;
/*
 * Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Controls” link
Select checkbox and click Remove
Click on Add button and verify “It’s back!” text is displayed
Close the browser 
 */

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Homework2 extends CommonMethods {
public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome","https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//input[@label='blah']")).click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Add']")));
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(2000);
		

		String text=driver.findElement(By.xpath("//p[@id='message']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.quit();
		
}

}