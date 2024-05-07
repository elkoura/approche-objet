package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {
        // Création de la liste de villes en utilisant Collections.addAll
        ArrayList<Ville> villes = new ArrayList<>();
        Collections.addAll(villes,
                new Ville("Nice", 343000),
                new Ville("Carcassonne", 47800),
                new Ville("Narbonne", 53400),
                new Ville("Lyon", 484000),
                new Ville("Foix", 9700),
                new Ville("Pau", 77200),
                new Ville("Marseille", 850700),
                new Ville("Tarbes", 40600)
        );

        // Rechercher et afficher la ville la plus peuplée
        Iterator<Ville> iter = villes.iterator();
        Ville villePlusPeuplee = null;
        while (iter.hasNext()) {
            Ville ville = iter.next();
            if (villePlusPeuplee == null || ville.getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
                villePlusPeuplee = ville;
            }
        }
        System.out.println("Ville la plus peuplée : " + villePlusPeuplee);

        // Supprimer la ville la moins peuplée
        iter = villes.iterator();
        Ville villeMoinsPeuplee = null;
        while (iter.hasNext()) {
            Ville ville = iter.next();
            if (villeMoinsPeuplee == null || ville.getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
                villeMoinsPeuplee = ville;
            }
        }
        villes.remove(villeMoinsPeuplee);
        System.out.println("Liste après suppression de la ville la moins peuplée : " + villes);

        // Mettre les noms des villes de plus de 100 000 habitants en majuscules
        iter = villes.iterator();
        while (iter.hasNext()) {
            Ville ville = iter.next();
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }
        System.out.println("Liste après mise en majuscules des villes de plus de 100 000 habitants : " + villes);
    }
}