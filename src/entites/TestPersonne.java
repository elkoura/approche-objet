package entites;

import entites.AdressePostale;
import entites2.Personne;


public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(123, "Rue des Lilas", "75008", "Paris");
        AdressePostale adresseCorriger = new AdressePostale(456, "Avenue des Champs-Elysées", "75008", "Paris");

        Personne personne1 = new Personne("Dupont", "Jean", adresse1);
        Personne personne2 = new Personne("Durand", "Marie", adresseCorriger);
        
        personne1.setAdresse(adresse1);  // Utilisation du setter pour définir l'adresse de p1.
        personne2.setAdresse(adresseCorriger);
        personne1.Afficher();
        personne2.Afficher();

        // Affichage direct des attributs
        //System.out.println(personne1.nom + " " + personne1.prenom + " habite à " + personne1.adresse.libelleRue + ", " + personne1.adresse.ville);
        //System.out.println(personne2.nom + " " + personne2.prenom + " habite à " + personne2.adresse.libelleRue + ", " + personne2.adresse.ville);
        
        System.out.println(personne1.getNom() + " " + personne1.getPrenom() + " habite à " + personne1.getAdresse().libelleRue + ", " + personne1.getAdresse().ville);
        System.out.println(personne2.getNom() + " " + personne2.getPrenom() + " habite à " + personne2.getAdresse().libelleRue + ", " + personne2.getAdresse().ville);
    }
}
