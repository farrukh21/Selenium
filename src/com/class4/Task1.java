package com.class4;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", URL);
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.id("isAgeSelected")).click();
		
		boolean clikbox=driver.findElement(By.id("isAgeSelected")).isSelected();
		System.out.println(clikbox);
		List<WebElement> groupCheckBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		Iterator<WebElement>it=groupCheckBox.iterator();
		while(it.hasNext()) {
			it.next().click();
		}
		Thread.sleep(10000);
		driver.quit();
	}
}
