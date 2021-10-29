package com.demo.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demo.pages.Dashboard;
import com.demo.pages.HomePage;
import com.demo.pages.LoginPage;

public class TestClass {
	
	WebDriver driver;
	HomePage home;
	LoginPage login;
	Dashboard dashboard;
	
	 @BeforeTest
	  public void beforeTest() {
		//Setting the driver path
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak.9.kumar\\eclipse-workspace\\DemoQA\\src\\Driver\\chromedriver.exe");
				//System.setProperty("webdriver.gecko.driver","C:\\Users\\Deepak.9.kumar\\eclipse-workspace\\DemoQA\\src\\Driver\\geckodriver.exe");
				
				//Creating WebDriver instance
				 driver = new ChromeDriver();
				//WebDriver driver = new FirefoxDriver();
				 
				home = new HomePage(driver);
				login = new LoginPage(driver);
				dashboard = new Dashboard(driver);
				
				//Navigate to web page
				driver.get("https://demoqa.com/login");
				
				//Maximizing window
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }
	
	  
	  @Test(priority = 1)
	  public void LoginTest() {
		  login.enterUsername("testuser");
		  login.enterPassword("Password@123");
		  
		  login.clickLogin();
		  
		  Assert.assertTrue(home.verifyUserIsOnHomePage("testuser"));
	  }
	  
	  @Test(priority = 2)
	  public void HomeTest() {
		  Assert.assertTrue(home.verifyLogoutButton(),"[Assertion Failed]: Logout button is not displayed");
		  
	  }
	  
	 // @Test(priority = 3)
	  public void DashboardTest() {
		  
	  }
	  

}
