package com.class4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Homework2 extends CommonMethods{
	public static final String URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", URL);
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		WebElement radio=driver.findElement(By.xpath("//input[@value='Male']"));
		radio.click();
		System.out.println(radio.isSelected());
		
		WebElement radio2=driver.findElement(By.xpath("//input[@value='15 - 50']"));
		radio2.click();
		
		System.out.println(radio2.isEnabled());
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("Screenshots/HRMS/AdminLogin.JPEG"));
		}catch(IOException e){
			e.printStackTrace();
		}
		driver.quit();
	}

}
