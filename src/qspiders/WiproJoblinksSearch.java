package qspiders;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJoblinksSearch {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
	List<WebElement> allsugg = driver.findElements(By.xpath("//a"));
	
   int count = allsugg.size();
   System.out.println(count);
   
  
	

   for (int i = 0; i <count; i++) {
	  String text=allsugg.get(i).getAttribute("href");
	  System.out.println(text);
	  
	
}
	}
}


