package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSugg {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(5000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]"));
		int count = allsugg.size();
		System.out.println(count);
     for (WebElement w : allsugg) 
     {
    	String text = w.getText();
    	System.out.println(text);
     }
     allsugg.get(count-1).click();
     
	}

}
