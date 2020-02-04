package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farrukh\\eclipse-workspace\\Sample\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aziza");
		driver.findElement(By.name("lastname")).sendKeys("Amonova");
		driver.findElement(By.name("reg_email__")).sendKeys("azizakhonamonova@gmail.com");
	}
}
