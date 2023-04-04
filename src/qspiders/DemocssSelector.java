package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemocssSelector {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args)
	  {
		WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/mmask/OneDrive/Desktop/Google.html");
	    driver.findElement(By.cssSelector("a[id='d1']")).click();
	    driver.navigate().back();
	    driver.findElement(By.cssSelector("a[name='n1']")).click();
	    driver.navigate().back();
	    driver.findElement(By.cssSelector("[class='c1']")).click();
	    driver.navigate().back();
	    driver.findElement(By.cssSelector("[href='https://www.jspiders.com']")).click();
	    driver.close();
		

	}

}
