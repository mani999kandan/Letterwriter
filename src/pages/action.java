package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class action {
	static WebDriver driver;
	 
    public action(WebDriver driver){ 
             this.driver=driver; 
             PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="(//button[@data-toggle='dropdown'])[1]") WebElement UserAdminTile;

    public void clickUserTile( )
    {
    	UserAdminTile.click(); 
    }
}
