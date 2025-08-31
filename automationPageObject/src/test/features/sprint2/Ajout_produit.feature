#Author: your.email@your.domain.com

@tag
Feature: Ajouter produits dans le panier
  apres m authenitifier, je veux ajouter des produits dans mon panier
  
  Background:
    Given saisir url "https://automationexercise.com/login"
    When saisir adresse mail suivante : "amina2@gmail.com"
    And saisir le mot de passe suivant : "abcdef123@"
    And cliquer sur le bouton se connecter
    Then verifier que "amina" est le nom du profil

  @AjoutProduit
  Scenario: Ajouter produit
    When cliquer sur le menu Produits
    And ajouter le produit blue top
    Then verifier affichage de "Added!"
    When cliquer sur le bouton shopping
    And selectionner le produit Sleevless Dress
    Then verifier affichage de "Added!"
    When cliquer sur view cart
    Then verifier affichage de la carte


