package qspiders;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNewsAutoSugg {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
	 /* String text = driver.findElement(By.xpath("//span[.='1']/../h3")).getText();
	  System.out.println(text);
	String	text1 =driver.findElement(By.xpath("//span[.='2']/../h3")).getText();
	System.out.println(text1);
		String text2 = driver.findElement(By.xpath("//span[.='3']/../h3")).getText();
		System.out.println(text2);
		String text3 = driver.findElement(By.xpath("//span[.='4']/../h3")).getText();
		System.out.println(text3);
		String text4 = driver.findElement(By.xpath("//span[.='5']/../h3")).getText();
		System.out.println(text4);
		*/
		
	  List<WebElement> allnews = driver.findElements(By.xpath("//li[@data-bbc-container='most-popular']"));
	  int count = allnews.size();
	  System.out.println(count);
	  for (WebElement w : allnews) {
		 System.out.println(  w.getText());     
		
	}
	
		
		
		

	}

}
