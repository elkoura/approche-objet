package fr.diginammic.salaire;

public class Pigiste extends Intervenant {
	private int nombreDejours;
	private double montantJournalier;
	
	
	
	public Pigiste(String nom, String prenom, int joursTravailles, double montantJournalier, int nombreDejours) {
		super(nom, prenom);
        this.nombreDejours = nombreDejours;
        this.montantJournalier = montantJournalier;
    }


	public double getMontantJournalier() {
		return montantJournalier;
	}

	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}

	

	protected String getStatut() {
		return "pigiste";
	}


	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return montantJournalier*nombreDejours;
	}
}
