package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoIsDisplayed 
 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	boolean	logo= driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	if(logo)
		System.out.println("LOGO is displayed and pass");
	else
		System.out.println("logo is not displayed and failed");
	driver.close();
	
		

	}

}
