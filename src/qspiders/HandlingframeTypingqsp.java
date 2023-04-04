package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingframeTypingqsp {

	 
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/mmask/OneDrive/Desktop/handlingframespage1.html");
			driver.findElement(By.id("d1")).sendKeys("qsp");
			driver.switchTo().frame(0);
			driver.findElement(By.id("d2")).sendKeys("jsp");
			driver.switchTo().defaultContent();
			
	}

}
