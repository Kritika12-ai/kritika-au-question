package com.automate;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		/*
		 * String url =
		 * driver.findElement(By.xpath("//ul//a[contains(text(),'Broken Link')]")).
		 * getAttribute("href");
		 * 
		 * HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		 * conn.setRequestMethod("HEAD"); conn.connect(); int respCode =
		 * conn.getResponseCode(); System.out.println(respCode);
		 */
		 
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		SoftAssert sa = new SoftAssert();
		
		for(WebElement link: links)
		{
			
			  String url =link.getAttribute("href");
			  
			  HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			  conn.setRequestMethod("HEAD"); 
			  conn.connect(); 
			  int respCode =conn.getResponseCode(); 
			  System.out.println(respCode);
			  sa.assertTrue(respCode < 400, "Link with text: "+link.getText()+" is broken with response code: "+respCode);
			 
		}
		sa.assertAll();

	}

}
