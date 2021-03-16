package com.automate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class YoutubeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id = 'search']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id = 'search']")).sendKeys(" ");
		//driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		/*
		 * WebElement ele = driver.findElement(By.xpath("//input[@id = 'search']"));
		 * Actions action = new Actions(driver); action.moveToElement(ele);
		 */
		
		List<WebElement> optionsToSelect = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
		String text_to_select = "selenium tutorial";

		for(WebElement option : optionsToSelect)
		{
		    System.out.println(option);
		    if(option.getText().equals(text_to_select)) 
		    {
		        System.out.println("Trying to select: "+text_to_select);
		        option.click();
		        break;
		    }
		}
		
		//String my_title = driver.getTitle();
		//System.out.println(my_title);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}

}
