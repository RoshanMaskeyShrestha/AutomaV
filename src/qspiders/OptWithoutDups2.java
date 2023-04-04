package qspiders;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptWithoutDups2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/hotel.html");
		WebElement lists = driver.findElement(By.id("mtr"));
		Select s=new Select(lists);
		List<WebElement> allLists = s.getOptions();
		TreeSet<String> a=new TreeSet<String>();
		for(int i=0;i<allLists.size();i++)
		{
			String text = allLists.get(i).getText();
			if(a.add(text)==false)
		
		System.out.println(text);
		}
		/*
		System.out.println("----for verticall print");
		for (String st : a) {
			System.out.println(st);
			
		}
		*/
		
		
	}

}
