package com.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("driver.chrome.driver","D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).contextClick().build().perform();

		
	}

}
