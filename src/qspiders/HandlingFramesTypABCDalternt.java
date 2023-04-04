package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesTypABCDalternt {


		 
			static {
				System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			}

			public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new ChromeDriver();
				driver.get("file:///C:/Users/mmask/OneDrive/Desktop/handlingframespage1.html");
				driver.findElement(By.id("d1")).sendKeys("A");
				WebElement ele = driver.findElement(By.xpath("//iframe"));
				driver.switchTo().frame(ele);
				driver.findElement(By.id("d2")).sendKeys("B");
				driver.switchTo().defaultContent();
				driver.findElement(By.id("d1")).sendKeys("C");
				driver.switchTo().frame("f1");
				driver.findElement(By.id("d2")).sendKeys("d");
				driver.switchTo().parentFrame();
				
		}

	}



