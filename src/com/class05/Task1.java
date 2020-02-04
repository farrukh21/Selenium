package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import utils.CommonMethods;
////TC 1: JavaScript alert text verification
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Alerts & Modals” links
//Click on “Javascript Alerts” links
//Click on button in “Java Script Alert Box” section
//Verify alert box with text “I am an alert box!” is present
//Click on button in “Java Script Confirm Box” section
//Verify alert box with text “Press a button!” is present
//Click on button in “Java Script Alert Box” section
//Enter text in the alert box
//Quit browser

public class Task1 extends CommonMethods {

	public static final String URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", URL);
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();

		driver.findElement(By.linkText("Javascript Alerts")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert = driver.switchTo().alert();
		String al = alert.getText();

		if (al.equals("I am an alert box!")) {
			System.out.println("confirmed");
		} else {
			System.out.println("I am an alert box is not present");
		}
		alert.dismiss();

		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Alert alert2 = driver.switchTo().alert();
		String al2 = alert2.getText();
		if (al2.equals("Press a button!")) {
			System.out.println("confirmed");
		} else {
			System.out.println("I am an alert box is not present");
		}
		alert2.dismiss();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert alert3=driver.switchTo().alert();
		String al3=alert3.getText();
		alert3.sendKeys(al3);
		alert3.accept();
	}
}
