package fr.diginamic.banque.entities;
import fr.diginamic.banque.entities.Compte;


public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("12345", 1000.50);
        System.out.println(compte);  // Affiche les informations du compte grâce à la méthode toString redéfinie
    }
}
