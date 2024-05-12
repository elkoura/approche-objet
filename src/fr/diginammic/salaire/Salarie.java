package fr.diginammic.salaire;

public class Salarie extends Intervenant {
	private double salaireMensuel;// represente le salaire mensuel du salariee

    public Salarie(String nom, String prenom, double salaireMensuel) {//initialiser salairmensuel et nom, prenom
		super(nom, prenom);
		this.salaireMensuel=salaireMensuel;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaireMensuel;
	}
	@Override
	protected String getStatut() {
		// TODO Auto-generated method stub
		return "salarie";
	}
	
	}

	
