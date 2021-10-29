package com.demo.qa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params {
	
	 @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before Class");
	  }
	
	 
	@Test
	@Parameters ({"val1", "val2"})
    public void Sum(int v1, int v2) {
    	int finalsum = v1 + v2;
        System.out.println("The final sum of the given values is " + finalsum);
    }
	
	 @AfterClass
	  public void afterClass() {
		  System.out.println("After Class");
	  }

}
