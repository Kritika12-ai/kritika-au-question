package com.automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddBackPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		//login
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//click backpack
		String str = "Sauce Labs BackPack";
		List<WebElement> items = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		for(WebElement item : items)
		{
			if(item.getText().equalsIgnoreCase(str))
			{
				driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
				break;
			}
		}
		
		

	}

}
