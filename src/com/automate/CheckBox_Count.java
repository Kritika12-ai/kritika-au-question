package com.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = 0;
		WebDriver driver;
		System.setProperty("driver.chrome.driver","D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		List<WebElement> check_box = driver.findElements(By.xpath("//input[contains(@id,'checkBoxOption')]"));
		
		for(WebElement val : check_box)
		{
			i++;
		}
		System.out.println("Checkbox present on Page is: "+i);
		
		driver.close();
		
	}

}
