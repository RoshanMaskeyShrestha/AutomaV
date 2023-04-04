package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com/");
		String etitle="Google";
		String atitle=driver.getTitle();
		SoftAssert s= new SoftAssert();
		s.assertEquals(atitle,etitle);
		driver.close();
		s.assertAll();
		}
	@Test(invocationCount = 2)
	public void verifyrTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com/");
		String etitle="Google";
		String atitle=driver.getTitle();
		SoftAssert s= new SoftAssert();
		s.assertEquals(atitle,etitle);
		driver.close();
		s.assertAll();
		}
}

	

	

	
	


