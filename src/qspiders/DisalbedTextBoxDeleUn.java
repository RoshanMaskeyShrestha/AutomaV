package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisalbedTextBoxDeleUn {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/Disabled.html");
		RemoteWebDriver r= (RemoteWebDriver)driver;
		r.executeScript("document.getElementById('d1').value='admin'");
		Thread.sleep(3000);
		r.executeScript("document.getElementById('d1').value=' '");
		r.executeScript("document.getElementById('d2').value='manager'");
		r.executeScript("document.getElementById('d3').click()");
		
		
		
		
		


	}

}
