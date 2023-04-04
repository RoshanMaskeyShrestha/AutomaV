package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	static { 
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	 {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/Google.html");
		driver.findElement(By.xpath("./html/body/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a")).click();
		driver.close();
		

	}

}
