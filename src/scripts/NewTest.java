package scripts;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
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
  public void f() throws InterruptedException {
	  
	  Actions actions = new Actions(driver);
	  
	driver.findElement(By.name("email")).sendKeys("pradeep.kp@isgn.com");
	driver.findElement(By.name("password")).sendKeys("test123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(5000);
	 WebElement menuOption = driver.findElement(By.xpath("(//a[@data-hover='dropdown'])[1]"));
	
	 actions.moveToElement(menuOption).perform();
	 Thread.sleep(5000);
	 WebElement templates = driver.findElement(By.xpath("(//li[@class='dropdown-submenu']//a)[1]"));
	 actions.moveToElement(templates).perform();	
	
	 WebElement templatecreate = driver.findElement(By.xpath("//li[@id='active_2_1_1']//a[1]"));
	 actions.moveToElement(templatecreate).perform();	
	
	 templatecreate.click();
	 Thread.sleep(5000);
	 WebElement Services = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]"));
	 actions.moveToElement(Services).perform();	
	
	 WebElement AccessService = driver.findElement(By.xpath("(//a[@class='menu_link'])[1]"));
	 actions.moveToElement(AccessService).perform();	
	 
	 AccessService.click();
	 
	 Thread.sleep(5000);

	 
	 WebElement accesorycode = driver.findElement(By.xpath("//li[text()='AccessoryCode']"));
	 actions.moveToElement(accesorycode).perform();	
	
	 Thread.sleep(5000);
	 
	
	// (//div[@class='popup_default-header ui-draggable-handle'])[2]
	 
	 WebElement summernote = driver.findElement(By.id("textInput_summernote"));
	 
	
	 actions.dragAndDrop(accesorycode, summernote);
	 
  }
  
  
  @AfterTest
  public void terminateBrowser() {
  
  
  }

}
