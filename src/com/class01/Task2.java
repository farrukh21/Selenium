package com.class01;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Farrukh\\eclipse-workspace\\Sample\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https:www.syntaxtechs.com");
		driver.navigate().to("https:www.google.com");
		driver.navigate().back();
		driver.navigate().refresh();
	
		
		
	}
}
