package com.class08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;
import utils.Constant;

public class WebTableDemo extends CommonMethods{

	public static void main(String[] args) {
		setUp("Chrome",Constant.SYNTAX_PRACTICE_URL);
		//navigate to the table we need
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		
		//find how many rows of data table has
		
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println("Number of rows in the table is="+rows.size());
        
		System.out.println("Printing row data -------------------------");
		Iterator <WebElement> Rowit=rows.iterator();
		while(Rowit.hasNext()) {
			String rowData=Rowit.next().getText();
			System.out.println(rowData);
		}
        
        
        //number of columns
        List<WebElement>cols=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println("Number of cols in the table is ="+cols.size());
        System.out.println("Printing column headers-----------------");
        for(WebElement col:cols) {
        	String header=col.getText();
        	System.out.println(header);
        	
        }
        //collection of all cells
        System.out.println("Printing cells-------------------------------------");
        List<WebElement> cells =driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));
        for(WebElement cell:cells) {
        	String cellData=cell.getText();        
        System.out.println(cellData);
        }
        System.out.println("Printing data cell by cell using for loop------------------------------");
        for(int i=1; i<rows.size(); i++) {//controlling rows
        	for(int y=1; y<cols.size(); y++) { //controlling columns
        		  
        	}
        }
	driver.quit();
	}
	
}
