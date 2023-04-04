package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodHandlingPOM {

		
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPagePOM l= new LoginPagePOM(driver);
		l.setLogin("admin1", "manager1");
		Thread.sleep(4000);
		l.setLogin("admin", "manager");
		
		}


	}


