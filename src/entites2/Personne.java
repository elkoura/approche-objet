package entites2;

import entites.AdressePostale;

public class Personne {
    // Attributs accessibles directement
    public String nom;
    public String prenom;
    public AdressePostale adresse;
	public Personne(String nom, String prenom, AdressePostale adresse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	//TODO tp3
		public void Afficher() {
		   System.out.println(prenom + " " + nom.toUpperCase());
		    // Setter pour le nom
		   
		}
		   public void setNom (String nom) {
			   this.nom = nom;  // Modifie l'attribut 'nom' de l'instance de la classe avec la nouvelle valeur passée en paramètre.
		    	
	    }
		   public void setPrenom(String prenom) {
		        this.prenom = prenom;
		}
		  public void setAdresse(AdressePostale adresse) {
		        this.adresse = adresse;
		    }
		  public String getNom() {
		        return nom;
		    }

		    // Getter pour le prénom
		    public String getPrenom() {
		        return prenom;
		    }

		    // Getter pour l'adresse
		    public AdressePostale getAdresse() {
		        return adresse;
		    }
		 
    
}
