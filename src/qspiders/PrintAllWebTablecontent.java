package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllWebTablecontent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver()	;
		driver.get("https://www.amazon.com/");
		List<WebElement> alltabcont = driver.findElements(By.xpath("//td"));
		for(int i=0;i<alltabcont.size();i++) {
			String text=alltabcont.get(i).getText();
			System.out.println(text);
		}

	}

}
