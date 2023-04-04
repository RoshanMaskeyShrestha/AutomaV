package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static WebDriver driver;
	@BeforeTest(groups= {"smoke test","regression test"})
	public void openBrowser()
	{   Reporter.log("Openbroswer",true);
	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("Close Browser");
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException
	{
		Reporter.log("Login",true);
		FileInputStream fis=new FileInputStream("./data/seledata.property");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys("un");
		driver.findElement(By.name("pwd")).sendKeys("pwd");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		
		
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout");
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		//driver.close();
	}

}
