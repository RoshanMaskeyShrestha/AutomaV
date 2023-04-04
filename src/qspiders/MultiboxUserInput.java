package qspiders;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiboxUserInput {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("enter the one of the menulist");
		Scanner s=new Scanner(System.in); 
		String str = s.nextLine();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select a =new Select(mtrlistbox);
		List<WebElement> opt = a.getOptions();
		//int count=opt.size();
		int count=0;
		for(int i=0;i<opt.size();i++)
		{
			String menu = opt.get(i).getText();
			if(menu .equals(str))
			count++;
		}
		
		if(count==1)
			System.out.println("one time present");
		else if(count>1)
			System.out.println("with duplicate");
		else
			System.out.println("not in options");
			
		
	
		
			
			
			
		
		}
		
		
	}
		
		
	
			

	





