package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CutomWaitExplicitEx1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			int i=0;
			while(i<=100)
			{
				try {
					driver.findElement(By.id("logoutLink")).click();
					//System.out.println("within 50sec");
					
				}
				catch(Exception e)
				{
					
					i++;
					System.out.println(i + " not able be find logout ");
					
				}
				
				
			}
	}

}
