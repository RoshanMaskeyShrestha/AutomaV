package qspiders;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClosExctSpeBrow {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
	//String fbwh = driver.getWindowHandle();
	    Set<String> allwh = driver.getWindowHandles();
	    for (String wh : allwh) {
	    	driver.switchTo().window(wh);
	    	
	    	String text = driver.getTitle();
	    	
	    //if(text.contains("Apple"))
	    	if(text.equals("Sign in with Apple�ID"))
	    	{
	    		
	    	}
	    	else
	    	{
	    		driver.close();
	    	}
	    	
	    	
	    	//driver.findElement(By.xpath("(//a[contains(text(),'Customers')])[2]")).click();
	    	
			
		}
		

	}

}
