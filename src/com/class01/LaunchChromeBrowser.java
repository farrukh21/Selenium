package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		// System- is a class and setProperty(); is a static method
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Farrukh\\eclipse-workspace\\Sample\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// http- hypertext transfer protocol source
		driver.get("https://www.google.com");

		// These are browser navigation commands

		driver.navigate().to("http://syntaxtechs.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
		
		driver.close();
	}
}
