package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodvalidInvalid {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	LoginPage l= new LoginPage(driver);
	l.setLogin("admin1", "manager1");
	Thread.sleep(3000);
	l.setLogin("admin", "manager");
	
	
	
	

	}

}
