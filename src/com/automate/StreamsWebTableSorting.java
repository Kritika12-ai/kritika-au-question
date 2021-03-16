package com.automate;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamsWebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column
		WebElement col = driver.findElement(By.xpath("//tr/th/span[1][contains(text(),'name')]"));
		col.click();
		// capture text of all web elements to new list
		List<WebElement> elements_list = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> original_list = elements_list.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort original list to new list
		List<String> sorted_list = original_list.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(original_list.equals(sorted_list));
		List<String> price;

		// scan column with get text -> Beans -> print price of rice
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));

			if (price.size() < 1) {
				driver.findElement(By.xpath("//li/a[@aria-label='Next']")).click();
			}
		} while (price.size() < 1);
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub

		String price_value = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return price_value;
	}

}
