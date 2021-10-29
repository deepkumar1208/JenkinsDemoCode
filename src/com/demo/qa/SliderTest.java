package com.demo.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static WebDriver driver;

	public static void main(String[] args) {

		// Set system properties for geckodriver This is required since Selenium 3.0
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak.9.kumar\\eclipse-workspace\\DemoQA\\src\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		// Launch the URL
		driver.get("https://demoqa.com/slider/");
		System.out.println("demoqa webpage Displayed");

		// Maximise browser window
		driver.manage().window().maximize();

		// Adding wait
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		// Instantiate Action Class
		Actions actions = new Actions(driver);
		// Retrieve WebElemnt 'slider' to perform mouse hover
		WebElement slider = driver.findElement(By.id("sliderContainer"));
		// Move mouse to x offset 50 i.e. in horizontal direction
		actions.moveToElement(slider, 50, 0).perform();
		slider.click();
		System.out.println("Moved slider in horizontal directions");

		
	}

}
