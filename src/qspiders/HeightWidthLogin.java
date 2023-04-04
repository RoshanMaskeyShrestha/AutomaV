package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidthLogin 
  {
   static
   {
	   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   }

	public static void main(String[] args) 
	   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login"));
	    int height=	driver.findElement(By.name("login")).getSize().getHeight();
		int width=driver.findElement(By.name("login")).getSize().getWidth();
		//driver.findElement(By.id("loginbutton"));
		//int height=driver.findElement(By.id("loginbutton")).getSize().getHeight();
		//int width=driver.findElement(By.id("loginbutton")).getSize().getWidth();
		System.out.println("Login height is "+height);
		System.out.println("Login width is "+width);
		driver.close();
		
		
		
      
	  

}
  }
