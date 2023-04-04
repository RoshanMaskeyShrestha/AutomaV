package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginEnabled 
  {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	   {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		boolean active =driver.findElement(By.name("login")).isEnabled();
		if(active)
			System.out.println("login is enabled and passed");
		else 
			System.out.println("login is not enabled and failed");
		driver.close();

	  }

}