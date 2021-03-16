package com.automate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row_count = 0;
		int col_count = 0;
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		//Get row count including header
		List<WebElement> values = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		for(WebElement element: values)
		{
			row_count++;
		}
		System.out.println("Total row count is: "+row_count);
		
		//Get column count
		List<WebElement> col_values = driver.findElements(By.xpath("//table[@name='courses']//tr/th"));
		for(WebElement element: col_values)
		{
			col_count++;
		}
		System.out.println("Total column count is: "+col_count);
		
		//get second row values
		System.out.println(driver.findElement(By.xpath("//table[@name='courses']//tr[3]")).getText());
			
		

	}

}
