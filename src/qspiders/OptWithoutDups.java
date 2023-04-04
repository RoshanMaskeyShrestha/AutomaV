package qspiders;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptWithoutDups {
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
        
       int tcount=allOptions.size();
       System.out.println(tcount);
       
        TreeSet<String>templist=new TreeSet<String>(originalList);
        System.out.println(templist);
        int edcount = templist.size();
        System.out.println(edcount );

	}

	
}
