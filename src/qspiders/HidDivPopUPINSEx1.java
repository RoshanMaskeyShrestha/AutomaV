package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HidDivPopUPINSEx1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.name("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		 WebElement mon = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select a=new Select(mon);
		 a.selectByValue("11");
		 WebElement yr = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		 Select b=new Select(yr);
		 b.selectByVisibleText("1990");
		 driver.findElement(By.xpath("//a[.='23']")).click();
		 driver.findElement(By.name("alternative_number")).sendKeys("9845098450");
		 driver.findElement(By.id("renew_policy_submit")).click();
		 if(driver.findElement(By.id("policynumberError")).isDisplayed())
			 System.out.println("true");
		 else 
			 System.out.println("false");
	
			 
		 
		 
		

	}

}
