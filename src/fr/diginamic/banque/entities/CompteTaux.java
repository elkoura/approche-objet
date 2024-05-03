package fr.diginamic.banque.entities;

public class CompteTaux extends Compte {
	private double taux;

	public CompteTaux(String NumCompt, double solde ,double taux) {
		super(NumCompt, solde);
		this.taux=taux;
		
		// TODO Auto-generated constructor stub
		
		//methode toString pour inclure le tuax de remuénaration
		
		
	
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteTaux [taux=" + taux + "]";
	}

}
