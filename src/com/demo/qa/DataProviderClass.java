package com.demo.qa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	//@Test(dataProvider = "dataMethod")
	public void testMethod(String param) {
		System.out.println("The Parameter is::"+ param);
	}
	
	@Test(invocationCount = 3)
	public void testMethod1() {
		System.out.println("Invocation count");
	}
	
	@DataProvider
	public Object[][] dataMethod(){
		return new Object[][] { {"one"}, {"two"}, {"three"}};
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

}
