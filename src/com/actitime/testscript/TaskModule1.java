package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule1 extends BaseClass {
	@Test(groups={"SmokeTesting","RegressionTesting"})
	public void createTask() {
		Reporter.log("create task ",true);
	}
	@Test(groups="RegressionTesting")
	public void modifyCustomer() {
		Reporter.log("modify task",true);
	}
	@Test(groups="SmokeTesting")
	public void deleteTask() {
		Reporter.log("delete task",true);
	}
	

}
