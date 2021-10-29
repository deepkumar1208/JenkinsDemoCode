package com.demo.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SeleniumUsingTestNG {
	
	WebDriver driver;
	int i=1;
	
  @Test
  public void LoginTest() {

	//Retrieving web page title
			String title = driver.getTitle();
			System.out.println("The page title is : " +title);
			
			Assert.assertEquals(title, "ToolsQA");
			
		//Locating web element
		WebElement uName = driver.findElement(By.xpath("//*[@id='userName']"));
		WebElement pswd = driver.findElement(By.xpath("//*[@id='password']"));
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id='login']"));
		
		
		//Performing actions on web elements
		uName.sendKeys("testuser");
		pswd.sendKeys("Password@123");
		loginBtn.click();
		
		//Putting implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try {
			
			//Locating web element
			WebElement logoutBtn = driver.findElement(By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']"));
			//Validating presence of element				
			if(logoutBtn.isDisplayed()){
				
				//Performing action on web element
				logoutBtn.click();
				System.out.println("LogOut Successful!");
			}
		} 
		catch (Exception e) {
			System.out.println("Incorrect login....");
		}
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting Execution the Test method 1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Ending Execution the Test method 1");
  }

  @BeforeTest
  public void beforeTest() {
	//Setting the driver path
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak.9.kumar\\eclipse-workspace\\DemoQA\\src\\Driver\\chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\Deepak.9.kumar\\eclipse-workspace\\DemoQA\\src\\Driver\\geckodriver.exe");
			
			//Creating WebDriver instance
			 driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
			
			//Navigate to web page
			driver.get("https://demoqa.com/login");
			
			//Maximizing window
			driver.manage().window().maximize();	
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
