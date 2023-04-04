package qspiders;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class PrintSpecficOptlist {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("Enter the options");
		Scanner s=new Scanner(System.in);
		String o=s.nextLine();
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/hotel.html");
		WebElement lists = driver.findElement(By.id("mtr"));
		Select se=new Select(lists);
		List<WebElement> allopt = se.getOptions();
		
		for (int i = 0; i <allopt.size() ; i++) {
		 String text = allopt.get(i).getText();
			
		 if(text.equals(o))
	     {
			    
				System.out.println(o);
			}
		}
		
	

	}

}
