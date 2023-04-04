package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectOption {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/hotel.html");
		WebElement allLists = driver.findElement(By.id("cp"));
		Select a=new Select(allLists);
		WebElement fsopt = a.getFirstSelectedOption();
		String text = fsopt.getText();
		System.out.println(text);
		
		
	   //  String text = a.getFirstSelectedOption().getText();
	
		//System.out.println(text);
		
	

	}

}
