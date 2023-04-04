package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlWithoutText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) 
	   {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/Demodiv.html");
	    List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
         for(WebElement a:allLinks)
         {
        	String text = a.getAttribute("href");
            System.out.println(text);
         }
	}

}
