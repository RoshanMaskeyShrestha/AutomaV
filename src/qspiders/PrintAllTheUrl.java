package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTheUrl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> allurl = driver.findElements(By.xpath("//a"));
		for(int i=0;i<allurl.size();i++)
		{
			String text = allurl.get(i).getAttribute("href");
			System.out.println(text);
		}
			
	

	}

}
