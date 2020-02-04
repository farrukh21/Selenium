package com.class10;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;
/*
 * Table headers and rows verification

Open chrome browser
Go to “https://www.aa.com/homePage.do”
Enter From and To
Select departure as May 14 of 2020
Select arrival as November 8 of 2020
Verify “Choose flights” text is displayed
Take s screenshot of the results
Close browser
 */

public class Homework extends CommonMethods {
	public static void main(String[] args) {
		setUp("chrome", "https://www.aa.com/homePage.do");
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("ATL");
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();

//		System.out.println(month);
		boolean found = false;
		while (!found) {

			driver.findElement(By.xpath("//a[@title='Next']")).click();
			String month = driver.findElement(By.xpath("//div[@class = 'ui-datepicker-title']")).getText();
			if (month.contains("May")) {
				found = true;
				List<WebElement> cells = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
				for (WebElement cell : cells) {
					if (cell.getText().equals("14")) {
						cell.click();
						break;
					}
				}
			}
			}
		boolean search=false;
		driver.findElement(By.xpath("//input[@id='aa-returningFrom']")).click();
		while(!search) {
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			String month = driver.findElement(By.xpath("//div[@class = 'ui-datepicker-title']")).getText();
		if(month.contains("November")) {
			search=true;
			List<WebElement> cells= driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));
			for(WebElement cell:cells) {
				if(cell.getText().equals("8")) {
					cell.click();
					break;
				}
			}
			
		}
		}
		TakesScreenshot aa=(TakesScreenshot)driver;
		File screenaa=aa.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenaa, new File("screenshots/HRMS/AA.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.quit();
		}
		}

	

