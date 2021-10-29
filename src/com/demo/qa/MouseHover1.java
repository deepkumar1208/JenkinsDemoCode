package com.demo.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {

	public static WebDriver driver;

	public static void main(String[] args) {

		// Set system properties for geckodriver This is required since Selenium 3.0
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak.9.kumar\\eclipse-workspace\\DemoQA\\src\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// Launch the URL
		driver.get("https://demoqa.com/menu/");
		System.out.println("demoqa webpage Displayed");

		// Maximise browser window
		driver.manage().window().maximize();

		// Adding wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Instantiate Action Class
		Actions actions = new Actions(driver);
		
		WebElement menuOption = driver.findElement(By.xpath(".//a[contains(text(),'Main Item 2')]"));
		
		actions.moveToElement(menuOption).perform();
		System.out.println("Done Mouse hover on 'Main Item 2' from Menu");

		
		WebElement subMenuOption = driver.findElement(By.xpath(".//a[contains(text(),'SUB SUB LIST')]"));
		actions.moveToElement(subMenuOption).perform();
		System.out.println("Done Mouse hover on 'Sub Sub List' from Menu");

		WebElement selectMenuOption = driver.findElement(By.xpath(".//a[contains(text(),'Sub Sub Item 1')]"));
		
		if(selectMenuOption.isDisplayed()) {
			System.out.println("Displayed");
		}else {
			System.out.print("Not displayed");
		}
		
		
		
		//System.out.println("Selected 'Alternative' from Menu");

	
		//driver.close();
	}

}
