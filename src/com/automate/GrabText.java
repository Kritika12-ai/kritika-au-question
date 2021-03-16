package com.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrabText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");

		// click checkbox and grab text
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		String selected_option = driver.findElement(By.xpath("//label[@for='bmw']")).getText();

		// select dropdown value
		Select dropDownOption = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		dropDownOption.selectByVisibleText(selected_option);

		// Enter text and click
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(selected_option);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

		// Grab popup text and match with checkbox value
		String popup_text = driver.switchTo().alert().getText();

		if (popup_text.contains(selected_option)) {
			System.out.println(selected_option + " is present in: " + popup_text);
		} else {
			System.out.println(selected_option + " is not present in grabbed text");
		}

	}

}
