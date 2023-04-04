package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyHeightWidthMeasure 
  {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int h1 = driver.findElement(By.name("username")).getSize().getHeight();
		int w1=driver.findElement(By.name("username")).getSize().getWidth();
		int h2 = driver.findElement(By.name("pwd")).getSize().getHeight();
		int w2 = driver.findElement(By.name("pwd")).getSize().getWidth();

		if(h1==h2 &&w1==w2)
			System.out.println(" Height and Width size is equal and pass ");
		else
			System.out.println(" Height and Width size is not equal and fail ");
		
			
	}

}
