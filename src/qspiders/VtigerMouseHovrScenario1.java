package qspiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerMouseHovrScenario1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("https://www.vtiger.com/");

WebElement rsrc = driver.findElement(By.partialLinkText("Resources"));
Actions a=new Actions(driver);
a.moveToElement(rsrc).perform()a.m
Thread.sleep(5000);
driver.findElement(By.partialLinkText("Customers")).click();
//driver.findElement(By.xpath("(//a[contains(text(),'Customers')])[2]")).click();
Thread.sleep(5000);
WebElement btn = driver.findElement(By.id("nav_button_main"));
a.doubleClick(btn).perform();

WebDriverWait wait =new WebDriverWait(driver, 7);
wait.until(ExpectedConditions.titleContains("Start Your Free Trial"));
String title = driver.getTitle();
if(title .contains("Start Your Free Trial"))
	System.out.println("pass");
else
	System.out.println("fail");




	}

} 
