package fr.diginammic.operations;



public class CalculMoyenne {
	private double [] valeurs;
	private int index;
	
	  public CalculMoyenne() {
	        valeurs = new double[10];  // Taille initiale
	        index = 0;
	  }
	  
	public void ajout(double valeur) {
		if (index==valeurs.length) {
			double [] nouveauTab=new double [valeurs.length*2];
			for (int i = 0; i < nouveauTab.length; i++) {
				nouveauTab[i]=valeurs[i];
			}
			valeurs=nouveauTab;
		}
		valeurs[index++]=valeur;
	}		
	public double calcul() {
		if (index==0) {
			return 0;
	}
	double somme=0;
	for (int i = 0; i < index; i++) {
		somme +=valeurs[i];
	}
	return somme / index;	
	}
	}
		
	
