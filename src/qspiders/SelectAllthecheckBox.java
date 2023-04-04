package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllthecheckBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/checkbox.html");
		List<WebElement> allselect = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<allselect.size();i++) {
			allselect.get(i).click();
		}
		
	

	}

}
