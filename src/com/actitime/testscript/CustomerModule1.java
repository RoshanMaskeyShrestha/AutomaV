package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClass1;

public class CustomerModule1 extends BaseClass1 {
	@Test (groups ={"SmokeTesting","RegressionTesting"})
	public void createCustomer()
 {
		Reporter.log("createCustomer",true);
	}
 @Test(groups="RegressionTesting")
 public void modifyCustomer()
 {
	 Reporter.log("modifyCustomer",true); 
 }
@Test (groups="RegressionTesting")
 public void deleteCustomer()
 {
	 Reporter.log("deleteCustomer",true); 
 }
}

	
	


