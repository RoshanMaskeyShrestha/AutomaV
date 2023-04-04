package qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnselectedOptionsList {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("file:///C:/Users/mmask/OneDrive/Desktop/hotel.html");
   WebElement alllist = driver.findElement(By.id("cp"));
   Select s =new Select(alllist);
   List<WebElement> allopt = s.getOptions();
   List<WebElement> selectopt = s.getAllSelectedOptions();
   int count=allopt.size();
   for(int i=0;i<count;i++)
   {  
      String text=allopt.get(i).getText();
      int counta=0;
      for(int j=0;j<selectopt.size();j++) {
    	  String text2=selectopt.get(j).getText();
    	  if(text.equals(text2)) {
    		  counta++;
    	  }
      }
      if(counta==0)
    	  System.out.println(text);
    	  
      
	   
   
	   
    
	}

}
}
