package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;
import utils.Constant;

public class JSEcecutor extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", Constant.HRMS_URL);
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement loginBtn=driver.findElement(By.id("btnLogin"));
		js.executeScript("arguments[0].click();", loginBtn);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click", loginBtn);
		Thread.sleep(3000);
		
		driver.quit();
	}
}
