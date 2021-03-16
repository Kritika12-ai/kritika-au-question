package com.automate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class WindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// click multiple windows
		driver.findElement(By.xpath("//ul/li/a[contains(text(),'Multiple Windows')]")).click();

		// open a new window
		WebElement new_window = driver.findElement(By.xpath("//div[@class='example']/a"));
		new_window.click();

		// using window handles to switch between windows
		ArrayList<String> selected_windows = new ArrayList<String>(driver.getWindowHandles());
		Iterator<String> it = selected_windows.iterator();
		String first_window = it.next();
		String second_window = it.next();

		driver.switchTo().window(second_window);
		System.out.println(driver.findElement(By.xpath("//div/h3[contains(text(),'New Window')]")).getText());
		driver.switchTo().window(first_window);
		System.out.println(driver.findElement(By.xpath("//div/h3[contains(text(),'Opening a new window')]")).getText());

	}

}
