package fr.diginammic.chaines;

import fr.diginammic.entities.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		int longeurChaineCarcter=chaine.length();
		System.out.println("longeur caractère: " + longeurChaineCarcter);
		int IndexDuPremier=chaine.indexOf("Marcel");
		 System.out.println("longeur caractère: " + IndexDuPremier);
		 int indexPremierPointVirgule = chaine.indexOf(';');
	     System.out.println("Index du premier point-virgule: " + indexPremierPointVirgule);
		 String nom=chaine.substring(0,indexPremierPointVirgule);
		 System.out.println("Nom de famille: " + nom);
		 String nomMAjuscules=nom.toUpperCase();
		 System.out.println("le nom en M:" + nomMAjuscules);
		 String nomMinuscules=nom.toLowerCase();
		 System.out.println("le nom en m:" + nomMinuscules);
		 // 7) Découper la chaîne en morceaux avec split
	        String[] morceaux = chaine.split(";");
	        for (String morceau : morceaux) {
	            System.out.println("Morceau: " + morceau);
	        }

	        // 8) Créer une instance de Salarie
	        String nomSalarie = morceaux[0];
	        String prenomSalarie = morceaux[1];
	        String salaireStr = morceaux[2].replace(" ", "");  // Supprimer les espaces
	        double salaire = Double.parseDouble(salaireStr);

	        Salarie salarie = new Salarie(nomSalarie, prenomSalarie, salaire);
	        System.out.println("Salarie: " + salarie);
	    }
	}
		 
		
			 
		 
		 
		 
		
		
		

