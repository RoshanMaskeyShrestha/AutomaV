package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	
 @Test (priority = 1) 
	public void createCustomer()
 {
		Reporter.log("createCustomer",true);
	}
 @Test (priority = 2)
 public void modifyCustomer()
 {
	 Reporter.log("modifyCustomer",true); 
 }
@Test (priority = 3)
 public void deleteCustomer()
 {
	 Reporter.log("deleteCustomer",true); 
 }
}
