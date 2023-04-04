package qspiders;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeadingUsingNotAttributeVal {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();
		String ptab = driver.getWindowHandle();
		Set<String> alltab = driver.getWindowHandles();
		for (String altb : alltab) {
			driver.switchTo().window(altb);
			
		}
		List<WebElement> allheading = driver.findElements(By.xpath("//h2[not(@id='application-service-agreement')]"));
		int count=allheading.size();
		System.out.println(count);
		 for (WebElement allagreement : allheading) {
			System.out.println(allagreement.getText());
			Thread.sleep(2000);
		}
       
		/*for (int i = 0; i < count; i++) {
			String text = allheading.get(i).getText();
			System.out.println(text);
			
		}
		*/
		 driver.close();
		 driver.switchTo().window(ptab);
		 driver.close();
		
	}

}
