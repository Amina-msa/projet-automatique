package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page_SignUp {
	
	public static WebDriver driver;
	
	
    /************Constructeur***********/
	
	public Page_SignUp(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/************identification element**************/
	
	/*@FindBy(how = How.XPATH , using ="//p[@class='fc-button-label']")
	WebElement bt_accept_cookies; */
	
	@FindBy(how = How.NAME , using ="email")
	//List<WebElement> txt_mail;
	WebElement txt_mail;
	
	@FindBy(how = How.NAME , using ="password")
	WebElement txt_mot_pass;
	
	@FindBy(how = How.XPATH , using ="//button[@data-qa='login-button']")
	WebElement bt_login;
	
	
	/************creation methode*************/
	
	/* public void cliquer_pour_accepter_cookies() {
		bt_accept_cookies.click();
	} */
	public void ecrire_dans_champs_mail(String text) {
		//txt_mail.get(0).sendKeys(text);
		txt_mail.sendKeys(text);
	}
	public void ecrire_dans_champs_mdp(String text) {
		txt_mot_pass.sendKeys(text);
	}
	public void cliquer_sur_login_pour_se_connecter() {
		bt_login.click();
	}

}
