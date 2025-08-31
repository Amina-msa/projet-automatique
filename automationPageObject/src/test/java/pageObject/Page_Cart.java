package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_Cart {

public WebDriver driver; 
	
	/************Constructeur***********/

    public Page_Cart(WebDriver driver) {
	
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
    }
    
    /************identification element**************/
	
    @FindBy(how = How.XPATH , using ="//a[@class='btn btn-default checkout']")
    WebElement bt_checkout;
    
    public boolean verifier_statut_du_btn_checkout() {
    	boolean statut = bt_checkout.isDisplayed();
    	return statut;
    }
}
