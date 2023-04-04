package qspiders;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintContentStaticWeb {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/Table1.html");
		List<WebElement> allText = driver.findElements(By.tagName("td"));
		int count=allText.size();
		System.out.println(count);
		for (WebElement w : allText) {
			System.out.println(w.getText());
		}
		
	 
		


	}

}
