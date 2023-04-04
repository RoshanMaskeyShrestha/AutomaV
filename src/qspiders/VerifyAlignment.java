package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int x = driver.findElement(By.name("username")).getLocation().getX();
		int  y = driver.findElement(By.name("pwd")).getLocation().getX();
		if(x==y)
			System.out.println("Alignment is in order and pass");
		else
			System.out.println("Alignment is not in order and fail");
		    driver.close();

	}

}
