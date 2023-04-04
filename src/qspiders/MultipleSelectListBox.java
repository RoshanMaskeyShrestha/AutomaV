package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectListBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select a =new Select(mtrlistbox);
		a.selectByIndex(4);
		Thread.sleep(3000);
		a.selectByValue("l");
		Thread.sleep(3000);
		a.selectByVisibleText("roti");
		Thread.sleep(3000);
		if(a.isMultiple()==true)
		{
			
	     a.deselectAll();
	     System.out.println(a.isMultiple());
	     
		
		}
		
		//a.deselectAll();
		//System.out.println(a.isMultiple());
		//driver.close();

	}

}
