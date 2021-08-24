package CommonFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	 WebDriver wd;
	 String username = "suresh.sesha83@gmail.com"; // Change to your username and passwrod
	 String password = "Test123!";
	 
	
    @BeforeClass //This method is to navigate High level Login URL
	public void Open_Browser(){
		 System.setProperty("webdriver.chrome.driver", "//Users//ranga//Downloads//chromedriver");
		 wd = new ChromeDriver();
		 wd.manage().window().maximize();
		 wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         wd.get("https://app.gohighlevel.com/");
  		}
	
	
	
    @Test // To login go high level
	public void Login_page() throws InterruptedException {
		 wd.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		 wd.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		 wd.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
}
	
	
	
    @Test() //Navigating to settings Page
	public void Setting_Page() throws InterruptedException {
		 WebElement element =wd.findElement(By.xpath("//span[contains(text(),'Settings')]"));
		 
		 Actions action = new Actions(wd);
		 action.moveToElement(element);
		 action.click().build().perform();
		 
		 wd.findElement(By.xpath("//li/a[contains(text(),'Calendars')]")).click();
		 
  }
	
	
    @Test()
	public void CreateNewCalendar() throws InterruptedException {
    	WebDriverWait some_element = new WebDriverWait(wd,100); 
    	some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'calendar_test')]/following::span[contains(text(),'New Calendar')]")));
    			

	}

	
   // @AfterClass
	//public void quit() {
	//	wd.close();
	//}

	
	
}