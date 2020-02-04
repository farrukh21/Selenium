package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Farrukh\\eclipse-workspace\\Sample\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:newtours.demoaut.com");
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.name("firstName")).sendKeys("Farrukh");
		driver.findElement(By.name("lastName")).sendKeys("Akhmedov");
		driver.findElement(By.name("userName")).sendKeys("benzema_@mail.ru");
		driver.findElement(By.name("phone")).sendKeys("5713543614");
		driver.findElement(By.name("lastName")).sendKeys("Akhmedov");
		driver.findElement(By.name("address1")).sendKeys("2677 av pl");
		driver.findElement(By.name("city")).sendKeys("Vienna");
		driver.findElement(By.name("state")).sendKeys("Virginia");
		driver.findElement(By.name("postalCode")).sendKeys("22180");
		driver.findElement(By.name("email")).sendKeys("benzema_@mail.ru");
		driver.findElement(By.name("password")).sendKeys("Akhmedov123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Akhmedov123");
		driver.findElement(By.name("register")).click();
		
				
	}

}
