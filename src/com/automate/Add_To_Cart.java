package com.automate;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_To_Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		//Thread.sleep(3000);

		addItems(driver, itemsNeeded);
		Cart(driver);
		checkOut(driver);

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Brocolli - 1 Kg

			// Brocolli, 1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

				// click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

	public static void Cart(WebDriver driver) {
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		WebElement add_to_cart = driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button"));

		if (add_to_cart.isEnabled()) {
			add_to_cart.click();
		} else {
			System.out.println("Please select an item to be added to cart");
		}

	}

	public static void checkOut(WebDriver driver) {
		WebElement promo_code = driver.findElement(By.xpath("//input[@class='promoCode']"));
		promo_code.sendKeys("RahulShettyAcademy.com");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));

		String info = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		System.out.println(info);
	}

}
