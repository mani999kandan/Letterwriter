package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class action {
	static WebDriver driver;
	 
    public action(WebDriver driver){ 
             this.driver=driver; 
             PageFactory.initElements(driver, this);
    }
}
