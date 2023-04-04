package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class taskmodule {
	@Test (priority = 1) 
	public void createtask()
 {
		Reporter.log("createtask",true);
	}
 @Test (priority = 2)
 public void modifytask()
 {
	 Reporter.log("modifytask",true); 
 }
@Test (priority = 3)
 public void deletetask()
 {
	 Reporter.log("deletetask",true); 
 }

}
