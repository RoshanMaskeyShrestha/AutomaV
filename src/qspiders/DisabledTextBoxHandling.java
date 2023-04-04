package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisabledTextBoxHandling {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/Disabled.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		RemoteWebDriver r = (RemoteWebDriver)driver;
		Thread.sleep(2000);
		r.executeScript("document.getElementById('d2').value='manager'");
		Thread.sleep(2000);
	    driver.findElement(By.id("d3")).click();
	    


	}

}
