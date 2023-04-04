package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertpopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void alert() {
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.switchTo().alert().dismiss();
	boolean a=(driver.findElement(By.id("demo"))).isDisplayed();
	System.out.println(a);
	driver.close();
	
	
		
}
}
