package com.automate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		// sum of table column values
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr/td[4]"));

		for (int i = 0; i < values.size(); i++) {

			sum = sum + Integer.parseInt(values.get(i).getText());

		}
		System.out.println(sum);
		
		//assert sum with ui value
		int ui_sum = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, ui_sum);

	}

}
