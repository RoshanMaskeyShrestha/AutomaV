package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDOB {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement date = driver.findElement(By.id("day"));
		Select a=new Select(date);
		a.selectByIndex(23);
		//a.selectByValue("23");
		WebElement mon = driver.findElement(By.id("month"));
		Select b=new Select(mon);
		b.selectByValue("12");
		
		WebElement yr = driver.findElement(By.id("year"));
		Select c=new Select(yr);
		c.selectByVisibleText("1990");
		//System.out.println(c.isMultiple());
		
		
		
		
		
		
		
		

	}

}
