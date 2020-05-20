package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PropertyCapsule {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
	
		
		driver.get("https://www.propertycapsule.com/");	
	    Thread.sleep(1000);
	    
	    
	    
	   }
}