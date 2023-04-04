package qspiders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionsAlphaOrder {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/mmask/OneDrive/Desktop/hotel.html");
		WebElement allLists = driver.findElement(By.id("mtr"));
        Select a=new Select(allLists );
        
        List<WebElement> allOptions = a.getOptions();
        ArrayList<String>originalList =new ArrayList<String>();
       for (WebElement s :  allOptions) {
        	originalList.add(s.getText());
        	
			
		}
        System.out.println(originalList);
        ArrayList<String> templist=new ArrayList<>(originalList);
        Collections.sort(templist);
        System.out.println(templ2 ist);
        
        
      int count= allOptions.size();
      System.out.println(count);
      
     
       
        	  
        }

	
        
        
		
	}


