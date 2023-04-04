package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule1 extends BaseClass{
	@Test(groups="SmokeTesting")
	public void createModule() {
		Reporter.log("create project",true);
	}
	@Test(groups={"SmokeTesting","RegressionTesting"})
	public void modifyModule() {
		Reporter.log("modify project",true);
	}
	@Test(groups={"SmokeTesting","RegressionTesting"})
	public void deleteModule() {
		Reporter.log("delete project",true);
	}

}
