package com.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cleartrip Flight Booking

		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");

		// select radio button one way
		WebElement radio_bttn = driver.findElement(By.xpath("//input[@id='OneWay']"));
		if (!radio_bttn.isSelected()) {
			radio_bttn.click();
		}

		// enter from
		WebElement from = driver.findElement(By.id("FromTag"));
		from.sendKeys("New");

		// calendar
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		// DropDowns
		Select adult = new Select(driver.findElement(By.name("adults")));
		adult.selectByValue("2");
		Select child = new Select(driver.findElement(By.name("childs")));
		child.selectByVisibleText("3");

		// Search Button
		driver.findElement(By.id("SearchBtn")).click();

		// grab error message
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
