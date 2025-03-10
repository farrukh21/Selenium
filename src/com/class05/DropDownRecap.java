package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class DropDownRecap extends CommonMethods {

	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);

		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Select Dropdown List")).click();
		// find the element with id select-demo and store it and a variable
		WebElement dd = driver.findElement(By.id("select-demo"));

		// to work with dd, if the tagname starts with select, then we have to create an
		// obect of select class
		Select select = new Select(dd);
		// select index 3
		select.selectByIndex(3);
		// selecting value by visible text
		select.selectByVisibleText("Friday");
		// selecting an item from dd using value attribute
		select.selectByValue("Sunday");

		// how to get the count of a dropdown items?
		List<WebElement> options = select.getOptions();
		// this will give you the number of items present in dd
		System.out.println(options.size());

		// storing the list of option in iterator so we can loop through
		Iterator<WebElement> it = options.iterator();
		while (it.hasNext()) {// loop through iterator if it has next element
			it.next().click();
			Thread.sleep(1000);
		}

		System.out.println("Does this dd support multiselect:" + select.isMultiple());

	}
}
