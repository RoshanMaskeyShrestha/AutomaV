package qspiders;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspAutoSugg {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Qspider");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'QSpider')]"));
		int count = allsugg.size();
		System.out.println(count);
		for (WebElement ob : allsugg) {
			System.out.println(ob.getText());	
		}
		allsugg.get(count-1).click();
		driver.close();
		
		

	}

}
