package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocGenderRadioBdn {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		//Thread.sleep(10000);
		
		int y1 = driver.findElement(By.xpath("//input[@value='1']")).getLocation()).getY();
		int y2=driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
		int y3=driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
		
		if(y1==y2 && y2==y3)
			{System.out.println("radio buttons are aligned properly and pass");
			}
		else {
			System.out.println("radio buttons are not aligned properly and fail");
		}
		driver.close();
	}

}
