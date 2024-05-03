package fr.diginamic.banque.entities;



public class Compte {
    private String numero;  // numéro de compte, non accessible directement en dehors de la classe
    private double solde;   // solde du compte, également privé

    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    // Getters pour accéder aux propriétés privées
    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    // Redéfinition de la méthode toString pour afficher les informations du compte
    @Override
    public String toString() {
    	return "Compte numéro: " + numero + ", Solde: " + solde;
    }
}
