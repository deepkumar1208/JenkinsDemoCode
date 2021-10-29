package com.demo.qa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SimpleTestFactory {
	
	@Factory
    public Object[] factoryMethod() {
        return new Object[] { new SimpleTest(0), new SimpleTest(1) };
    }

}

 class SimpleTest 
{
	 
	 private int param;
	 
	    public SimpleTest(int param) {
	        this.param = param;
	    }
	 
	    @Test
	    public void testMethodOne() {
	        int opValue = param + 1;
	        System.out.println("Test method one output: " + opValue);
	    }
	 
	    @Test(dependsOnMethods = "testMethodOne")
	    public void testMethodTwo() {
	        int opValue = param + 2;
	        System.out.println("Test method two output: " + opValue);
	    }
	    
	    
    
}
