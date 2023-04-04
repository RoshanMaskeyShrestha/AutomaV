package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertIfElse {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
 @Test
public void verifyTitle()
{WebDriver driver = new ChromeDriver();
driver.get("https://google.com/");
String eTitle= "google";
String aTitle= driver.getTitle();
if(eTitle .equals(aTitle))
	System.out.println("Title matching and pass");
else
	System.out.println("Title not matching and fail");
driver.close();
}
	
}

