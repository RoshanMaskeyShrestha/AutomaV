import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FieldLib;

public class HandlingActiUsingFieldLib {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws IOException {
     FieldLib f=new FieldLib();
     String url = f.getPropertyData("url");
     String un = f.getPropertyData("username");
     String pw = f.getPropertyData("password");
     WebDriver driver=new ChromeDriver();
     driver.get(url);
     driver.findElement(By.id("username")).sendKeys(un);
     driver.findElement(By.name("pwd")).sendKeys(pw);
     driver.findElement(By.xpath("//div[.='Login ']")).click();
	}

}
