package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseEcomm {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/nike-shoes-for-men-under-3000?extra_search_param=isautosuggestentry%3atrue%3a%3aid%3a2297-nike-shoes-for-men-under-3000");
		String text=driver.findElement(By.xpath("//h3[@class='product-brand']/../../../../li[3]/a/div[2]/div/span/span[1]")).getText();
		System.out.println(text);
		
		
		
	

	}

}
