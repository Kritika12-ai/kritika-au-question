package com.automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("driver.chrome.driver","D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();

		/*
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.quit();
		 */
	}

}
