package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locator for login button
	By LoginBtn = By.id("login");
	By labelName = By.xpath(".//label[@id='userName-value']");
	By logout = By.cssSelector("#submit");
	
	//Method to click login button
	public void clickLogin() {
		driver.findElement(LoginBtn).click();
	}
	
	public String getTitleofHomePage() {
		return driver.getTitle().trim();
	}

	public boolean verifyUserIsOnHomePage(String string) {
		return driver.findElement(labelName).getText().trim().contains(string);
	}

	public boolean verifyLogoutButton() {
		return driver.findElement(logout).isDisplayed();
	}

}
