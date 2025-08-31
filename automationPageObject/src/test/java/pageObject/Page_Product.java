package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_Product {

	
	public WebDriver driver; 
	
	/************Constructeur***********/

    public Page_Product(WebDriver driver) {
	
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
    }
    
    /************identification element**************/
	
    @FindBy(how = How.XPATH , using ="//a[@class='btn btn-default add-to-cart']")
    List<WebElement> ls_bt_add_to_cart;
    
    @FindBy(how = How.XPATH , using ="//h4[@class='modal-title w-100']")
    WebElement txt_msg_added;
    
    @FindBy(how = How.XPATH , using ="//button[@class='btn btn-success close-modal btn-block']")
    WebElement bt_continuer_shop;
    
    @FindBy(how = How.XPATH , using ="//p[@class='text-center']//a")
    WebElement bt_view_cart;
    
    /************creation methode*************/
    
    public void ajouter_blue_top_dans_panier() {
    	ls_bt_add_to_cart.get(0).click();
    }
    
    public void ajouter_sleevless_dress_dans_panier() {
    	ls_bt_add_to_cart.get(4).click();
    }
    
    public String recuperer_mesage_added() {
    	String txt = txt_msg_added.getText();
    	return txt;
    }
    
    public void cliquer_sur_continuer_shop() {
    	bt_continuer_shop.click();
    }
    
    public void aller_voir_panier() {
    	bt_view_cart.click();
    }
}
