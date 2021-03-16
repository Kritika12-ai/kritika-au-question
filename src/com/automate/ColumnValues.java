package com.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColumnValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		//navigate to last page
		driver.findElement(By.xpath("//ul[@id='myPager']//a[@class='next_link']")).click();
		driver.findElement(By.xpath("//ul[@id='myPager']//a[@class='next_link']")).click();
		
		//get column values
		List<WebElement> col_values = driver.findElements(By.xpath("//section[@class = 'content']//tr/td"));
		
		for(WebElement element : col_values)
		{
			if(element.getText().equals("11") || element.getText().equals("12") || element.getText().equals("13"))
				System.out.println(element.getText());
		}

	}

}
