package fr.diginammic.salaire;

public abstract class  Intervenant {
	protected String nom;
    protected String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public abstract double getSalaire();
    public void afficherDonner() {
    	System.out.println("nom: " +nom);
    	System.out.println("prénom: " + prenom);
    	System.out.println("salaire: " + getSalaire());

    	System.out.println("statut: " + getStatut() );

    }
	protected abstract String getStatut();
    
	

}

