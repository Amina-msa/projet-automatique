package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.SetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Page_Cart;
import pageObject.Page_Home;
import pageObject.Page_Product;

public class Ajout_produit {

	public static WebDriver driver = SetUp.driver ;
	
	Page_Home home = new Page_Home(driver);
	Page_Product produit = new Page_Product(driver);
	Page_Cart cart = new Page_Cart(driver);
	
	@When("cliquer sur le menu Produits")
	public void cliquer_sur_le_menu_produits() {
	    home.cliquer_sur_bouton_produits();
	}

	@When("ajouter le produit blue top")
	public void ajouter_le_produit_blue_top() {
	    produit.ajouter_blue_top_dans_panier();
	}

	@Then("verifier affichage de {string}")
	public void verifier_affichage_de(String string) {
	    Assert.assertEquals(string, produit.recuperer_mesage_added());
	}

	@When("cliquer sur le bouton shopping")
	public void cliquer_sur_le_bouton_shopping() {
	    produit.cliquer_sur_continuer_shop();
	}

	@When("selectionner le produit Sleevless Dress")
	public void selectionner_le_produit_sleevless_dress() {
	    produit.ajouter_sleevless_dress_dans_panier();
	}

	@When("cliquer sur view cart")
	public void cliquer_sur_view_cart() {
	  produit.aller_voir_panier();
	}

	@Then("verifier affichage de la carte")
	public void verifier_affichage_de_la_carte() {
	    Assert.assertEquals(cart.verifier_statut_du_btn_checkout(), true);
	}
	
}
