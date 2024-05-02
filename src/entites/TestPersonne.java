package entites;

import entites.AdressePostale;
import entites2.Personne;


public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(123, "Rue des Lilas", "75008", "Paris");
        AdressePostale adresse2 = new AdressePostale(456, "Avenue des Champs-Elysées", "75008", "Paris");

        Personne personne1 = new Personne("Dupont", "Jean", adresse1);
        Personne personne2 = new Personne("Durand", "Marie", adresse2);

        // Affichage direct des attributs
        System.out.println(personne1.nom + " " + personne1.prenom + " habite à " + personne1.adresse.libelleRue + ", " + personne1.adresse.ville);
        System.out.println(personne2.nom + " " + personne2.prenom + " habite à " + personne2.adresse.libelleRue + ", " + personne2.adresse.ville);
    }
}
