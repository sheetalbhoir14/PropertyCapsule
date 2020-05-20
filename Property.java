/*** Testcase 1 :- Valid Sign up form with LinkedIn unique email Id and password 
*/

package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Property {

	public static void main(String[] args) throws InterruptedException {
	
    //Launch Firefox Browser	
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ram\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	//Enter the URL
	driver.get("https://www.propertycapsule.com/");	
    Thread.sleep(1000);
	//Click on Dealmaker Sign up link
	driver.findElement(By.xpath("/html/body/header/div[3]/div[3]/a[2]")).click();
	Thread.sleep(1000);
	//Click on LinkedIn sign up 
	driver.findElement(By.xpath("/html/body/app-root/app-marqetmap-app/app-map/app-popup/app-signup/div/div/perfect-scrollbar/div/div[1]/div/div[1]/form/div[2]/div")).click();
	//Enter valid MailId
	driver.findElement(By.cssSelector("#username")).sendKeys("sheetalbhoir14@gmail.com");
	//Enter valid Password
	driver.findElement(By.cssSelector("#password")).sendKeys("DeleteSB@1997");
	//Login done
	driver.findElement(By.cssSelector(".btn__primary--large")).click();
	Thread.sleep(1000);
	System.out.println("Login done Successfully");
	Thread.sleep(1000);
	//Logout 
	driver.findElement(By.xpath("/html/body/app-root/app-marqetmap-app/app-header/div[1]/div[1]/i")).click();
	driver.findElement(By.cssSelector("div.drop-down-row:nth-child(5) > div:nth-child(1)")).click();
	System.out.println("Logout Successfully");
	Thread.sleep(1000);
	

	
	/** Testcase 2:- To test the Contact Us link from Homepage
	*/
	
    driver.navigate().to("https://www.propertycapsule.com/");
	Thread.sleep(1000);
	//Click on Contact us link from homepage
	 driver.findElement(By.cssSelector("body > footer:nth-child(10) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click();
	 Thread.sleep(5000);
	// Close contact us form
	 driver.findElement(By.cssSelector(".contact-us-close-btn")).click();
	 System.out.println("Test completed");
	

	       
	/** Testcase 3:- To test the Terms of service link from Homepage
	*/
	
	 //Click on Contact us link from homepage
	   driver.findElement(By.cssSelector("body > footer:nth-child(10) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
	   Thread.sleep(5000);
	// Close contact us form
	  driver.findElement(By.cssSelector("#terms-conditions-container > div:nth-child(1) > i:nth-child(1)")).click();
	  System.out.println("Test Completed");
	  
	  driver.close();

	}
	}   	 