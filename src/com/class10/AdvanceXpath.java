package com.class10;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class AdvanceXpath extends CommonMethods {
/*
 * Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “parent and child relation”
 */
	
	public static void main(String[] args) {
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("UserOne");
		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Syntax123!");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	}
}
