package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageLoad {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(7,TimeUnit.SECONDS);
     try {
    	 driver.get("https://demo.actitime.com/");
    	 System.out.println("page loaded within 7 sec");
     }
     catch(Exception e)
     {
    	 System.out.println("page is not loaded within 15 sec");
     }
     driver.close();
	}

}
