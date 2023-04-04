package qspiders;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUpIndeed {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		Thread.sleep(3000);
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-facebook-button")).click();
		Thread.sleep(3000);
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		
		/*for (String ob : allwh) {
		  driver.switchTo().window(ob);
		  System.out.println(ob);
		  String text = driver.getTitle();
		  System.out.println(text);
		  */
		 Iterator<String> i = allwh.iterator();
		 {
			 String wh;
			while(i.hasNext())
			{ wh=i.next();
			System.out.println(wh);
				 driver.switchTo().window(wh);
			  String text = driver.getTitle();
			  System.out.println(text);
			}
			
			  
			 
			   		 
			
		}
		
		/*Iterator<String> i = allwh.iterator();
		{
			while(i.hasNext())
			{
				System.out.println(i.next());
				
			}
		}
		*/
		
		

	}

}
