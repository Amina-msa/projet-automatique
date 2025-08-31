package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_Home {
	
    public WebDriver driver;
	
	
    /************Constructeur***********/

    public Page_Home(WebDriver driver) {
	
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
    }
    
	/************identification element**************/
	
     @FindBy(how = How.XPATH , using ="//ul[@class='nav navbar-nav']//li[10]//b")
     WebElement txt_nom_profil;
     
     @FindBy(how = How.XPATH , using ="//a[text()=' Products']")
     WebElement bt_produits;
     
	/************creation methode*************/

     public void acceder_a_url(String text) {
    	 driver.get(text);
     }
     
     public String reccuperer_le_nom_du_profil() {
    	 String profil = txt_nom_profil.getText();
    	 return profil;
     }
     
     public void cliquer_sur_bouton_produits() {
    	 bt_produits.click();
     }
}
