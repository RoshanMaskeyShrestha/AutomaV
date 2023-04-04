package qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxStatus {

	
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) 
		   {
			WebDriver driver=new ChromeDriver();															
			driver.get("https://demo.actitime.com/login.do");
			boolean ch = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
			if(ch==false)
				System.out.println("checkbox is not selected and pass");
			else
				System.out.println("checkbox is selected and fail");
			driver.close();

		  }
		

	

}
