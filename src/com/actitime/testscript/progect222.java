package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListnersImplementation.class)
public class progect222 extends BaseClass{
	
	
	    @Test 
		public void createProject111111(){
			Reporter.log("createProject",true);
			Assert.fail();
		}

	}


