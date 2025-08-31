
@tag
Feature: Authentification page home
  En tant que utilisateur je veux me connecter

  @authentification
  Scenario: authentification valide
    Given saisir url "https://automationexercise.com/login"
    When saisir adresse mail suivante : "amina2@gmail.com"
    And saisir le mot de passe suivant : "abcdef123@"
    And cliquer sur le bouton se connecter
    Then verifier que "amina" est le nom du profil

