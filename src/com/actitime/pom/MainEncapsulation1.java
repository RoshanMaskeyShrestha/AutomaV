package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainEncapsulation1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Encapsulation1 e=new Encapsulation1(driver);
		e.setLogin("admin", "manager");
		driver.close();
		
	}

}
