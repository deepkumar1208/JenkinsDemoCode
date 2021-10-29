package com.demo.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	public WebDriver driver;

	@Test
	public void FirefoxTest() {
		
		System.out.println("The thread ID for firefox Test is "+ Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Deepak.9.kumar\\eclipse-workspace\\DemoQA\\src\\Driver\\geckodriver.exe");
		// Initializing the firefox driver (Gecko)
		driver = new FirefoxDriver();
		// Navigate to web page
		driver.get("https://demoqa.com/login");

		// Maximizing window
		driver.manage().window().maximize();

		// Retrieving web page title
		String title = driver.getTitle();
		System.out.println("The page title is : " + title);
		driver.quit();
	}

	@Test
	public void ChromeTest() {
		
		System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak.9.kumar\\eclipse-workspace\\DemoQA\\src\\Driver\\chromedriver.exe");
		// Initialize the chrome driver
		driver = new ChromeDriver();
//Navigate to web page
		driver.get("https://demoqa.com/login");

		// Maximizing window
		driver.manage().window().maximize();

		// Retrieving web page title
		String title = driver.getTitle();
		System.out.println("The page title is : " + title);

		
		driver.quit();
	}

}
