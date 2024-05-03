package fr.diginamic.banque.entities;

public abstract class Operation {
    protected String date;
    protected double montant;

    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    public abstract String getType();  // Méthode abstraite à redéfinir dans les classes filles

    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }
}
