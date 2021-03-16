package com.automate;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		TakesScreenshot scr_shot = (TakesScreenshot)driver;
		File src = scr_shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\aayush.jain\\Downloads\\UI_Automation\\screenshot.png"));

	}

}
