package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Farrukh\\eclipse-workspace\\Sample\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		userName.sendKeys("VanEarl");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("VanEarl@&12");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement logo = driver.findElement(By.xpath("//*[@id='branding']/a[1]/img"));
		System.out.println(logo.isDisplayed());

		
	}
}
