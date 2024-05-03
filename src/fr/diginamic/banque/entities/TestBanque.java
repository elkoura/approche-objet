package fr.diginamic.banque.entities;
import fr.diginamic.banque.entities.Compte;




public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte("12345", 1500.00);  // Compte normal
        comptes[1] = new CompteTaux("54321", 2000.00, 2.5);  // Compte avec taux
        for (Compte compte : comptes) {
            System.out.println(compte);  // Appelle implicitement la méthode toString() de chaque compte
        }
    }
}
