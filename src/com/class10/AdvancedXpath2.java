package com.class10;

import org.openqa.selenium.By;

import utils.CommonMethods;

/*
 * Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
Login to the application by writing xpath based on “following and preceding siblings”
 */
public class AdvancedXpath2 extends CommonMethods{
	public static void main(String[] args) {
		setUp("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");

		driver.findElement(By.xpath("//input[@id='txtUsername']/following-sibling::span")).sendKeys("UserOne");
	    driver.findElement(By.xpath("//div[@id='divPassword']//following-sibling::input")).sendKeys("Syntax123!");
	    driver.findElement(By.xpath("//div[@id='divLoginButton']//following-sibling::input")).click();
}
}
