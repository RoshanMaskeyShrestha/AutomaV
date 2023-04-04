package qspiders;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartHiddenPop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
	List<WebElement> alliphone = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]"));
	int count=alliphone.size();
	System.out.println(count);
	for(WebElement e:alliphone)
	{
		System.out.println(e.getText());
	}
		
	System.out.println("-------------------------");
	List<WebElement> alliphonePrice = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max ')]/../../div[2]/div[1]/div[1]"));
	ArrayList<String> alliphonePriceWithoutRs=new ArrayList<>();
	for(WebElement e:alliphonePrice)
	{
		System.out.println(e.getText().substring(1));
		alliphonePriceWithoutRs.add(e.getText().substring(1));
	}
	
	//product1 ===> price1
	for(int i=0;i<count;i++)
	{
		System.out.println(alliphone.get(i).getText()+" ===> "+ alliphonePrice.get(i).getText());
	}
	
	System.out.println("****************************************************");
	for(int i=0;i<count;i++)
	{
		System.out.println(alliphone.get(i).getText()+" ===> "+ alliphonePriceWithoutRs.get(i));
	} 
	driver.close();
	}

}
