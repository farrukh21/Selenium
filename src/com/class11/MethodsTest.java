package com.class11;

import utils.CommonMethods;

public class MethodsTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "https://github.com/SyntaxTechnologies/SeleniumReviewBatchV");
		Thread.sleep(2000);
		scrollDown(1000);
		Thread.sleep(3000);
		scrollUp(1000);
		Thread.sleep(1000);
		driver.quit();
		
	}
}
