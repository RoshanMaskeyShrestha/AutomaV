package qspiders;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertConfPopUpHand {
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	    Alert a = driver.switchTo().alert();
	    a.accept();
	    driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    a.dismiss();
	    if(driver.findElement(By.id("demo")).isDisplayed())
	    	System.out.println("Displayed");
	    else
	    	System.out.println("not displayed");
	
		

	}

}
