package scripts;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class NewTest {
    public String baseUrl = "http://10.175.218.151:8989/letterwriter/";
 
    public WebDriver driver ;

  @BeforeTest
  public void launchBrowser() {
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.chrome.driver", "D://Manikandan//Manikandan//Gators Automation//Selenium Jar files//chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(baseUrl);
  }

  @Test
  public void f() {
	  
	 //JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement user= driver.findElement(By.name("email"));


		//	 js.executeScript("document.getElement(By.xpath(\"//input[@name='email']\")).value='Test';");  
			// js.executeScript("document.getElementByName('email').value='someValue';");
 
  }
  
  
  @AfterTest
  public void terminateBrowser() {
  
  
  }

}
