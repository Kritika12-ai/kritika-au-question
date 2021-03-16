package com.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Check_Uncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("driver.chrome.driver","D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		WebElement check_box = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		if(!check_box.isSelected())
		{
			check_box.click();
			Assert.assertTrue(check_box.isSelected());
			System.out.println("Checkbox selected is:"+check_box.isSelected());
		
			check_box.click();
			Assert.assertFalse(check_box.isSelected());
			System.out.println("Checkbox selected is:"+check_box.isSelected());
			
		}
		
		driver.close();

	}

}
