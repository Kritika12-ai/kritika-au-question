package com.automate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlFromFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("driver.chrome.driver", "D:\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aayush.jain\\Downloads\\UI_Automation\\UI_Automation\\src\\utilities\\test.txt"));
		String read = "";
		String line = null;
		
		while((line = br.readLine()) != null)
		{
			read = read + line;
		}
		br.close();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(read);
	}

}
