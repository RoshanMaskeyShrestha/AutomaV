package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Encapsulation1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public void encap() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		private  WebElement untbx;
		private WebElement pwtbx;
		private WebElement lgbtn;
		
		public Encapsulation1(WebDriver driver) {
		 untbx = driver.findElement(By.id("username"));
		 pwtbx=driver.findElement(By.name("pwd"));
		 lgbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
		 
		 public void setLogin(String un,String pw) {
			 untbx.sendKeys(un);
			 pwtbx.sendKeys(pw);
			 lgbtn.click();
		 }
		 
		 
		
		
	

}
