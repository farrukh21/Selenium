package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Recap extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "https://google.com");
		driver.findElement(By.name("q")).sendKeys("iphone 11", Keys.ESCAPE);
		Actions act=new Actions(driver);
		WebElement button=driver.findElement(By.name("btnK"));
		act.click(button).perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
