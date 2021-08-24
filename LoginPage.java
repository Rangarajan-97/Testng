package CommonFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	 WebDriver wd;
	 String username = "suresh.sesha83@gmail.com"; // Change to your username and passwrod
	 String password = "Test123!";
	 
	
    @BeforeClass //This method is to navigate flipkart URL
	public void Open_Browser(){
		 System.setProperty("webdriver.chrome.driver", "//Users//ranga//Downloads//chromedriver");
		 wd = new ChromeDriver();
		 wd.manage().window().maximize();
		 wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         wd.get("https://app.gohighlevel.com/");
        String Title= wd.getTitle();
        System.out.println(Title);
		}
	
	
	@Test // To login go high level
	public void Login_page() {
		 wd.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		 wd.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		 wd.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		 
		 
	}
	
	@Test() //Navigating to settings Page
	public void Setting_Page() throws InterruptedException {
		 wd.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
		 wd.findElement(By.xpath("//li/a[contains(text(),'Calendars')]")).click();
		 Thread.sleep(5);
  }
	
	@Test()
	public void CreateNewCalendar() throws InterruptedException {
		wd.findElement(By.xpath("//span[contains(text(),'calendar_test')]/following::span[contains(text(),'New Calendar')]")).click();
		 Thread.sleep(10);

	}

	//@AfterClass
	//public void quit() {
	//	wd.close();
	//}

	
	
}