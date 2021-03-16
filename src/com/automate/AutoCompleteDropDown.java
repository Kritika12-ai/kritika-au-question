package com.automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value"));
	}

}
