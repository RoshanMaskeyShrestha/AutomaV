package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameValidate {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String tag = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		if(tag .equals("a"))
		System.out.println(true);
		else 
			System.out.println("false");
		driver.close();
	}

}
