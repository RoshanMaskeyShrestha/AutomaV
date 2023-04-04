package com.actitime.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	static WebDriver driver=new ChromeDriver();

	public static void main(String[] args )    {
		driver.get("https://demo.actitime.com/");
		LoginPage l = new LoginPage(driver);
		
		l.setLogin("admin", "manager");
		
driver.close();
	}
	
	

}
