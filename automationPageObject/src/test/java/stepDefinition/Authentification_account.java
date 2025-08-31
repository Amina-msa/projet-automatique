package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Page_Home;
import pageObject.Page_SignUp;

public class Authentification_account {
	
	//premiere etape liaison driver de cette page avec celui de la page SetUp
	public static WebDriver driver = SetUp.driver ;
	
	//deuxieme etape faire appel aux pages qu'on y besoin, dans ce cas on a besoin de 2 pages
	Page_Home home = new Page_Home(driver);
	Page_SignUp sign = new Page_SignUp(driver);
	
	//saisir url mawjoud fi Page_Home donc on fait appel à la Page_Home qu'on a deja déclaré "home"
	@Given("saisir url {string}")
	public void saisir_url(String string) {
	    home.acceder_a_url(string);
	}

	/*@Given("accepter les cookies")
	public void accepter_les_cookies() {
	    sign.cliquer_pour_accepter_cookies();
	} */

	@When("saisir adresse mail suivante : {string}")
	public void saisir_adresse_mail_suivante(String string) {
	   sign.ecrire_dans_champs_mail(string);
	}

	@When("saisir le mot de passe suivant : {string}")
	public void saisir_le_mot_de_passe_suivant(String string) {
	    sign.ecrire_dans_champs_mdp(string);
	}

	@When("cliquer sur le bouton se connecter")
	public void cliquer_sur_le_bouton_se_connecter() {
	    sign.cliquer_sur_login_pour_se_connecter();
	}
    //verification = Assert
	@Then("verifier que {string} est le nom du profil")
	public void verifier_que_est_le_nom_du_profil(String string) {
	    Assert.assertEquals(string, home.reccuperer_le_nom_du_profil());
	}

}
