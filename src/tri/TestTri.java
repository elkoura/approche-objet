package tri;

import fichiers.Ville;
import java.util.ArrayList;
import java.util.Collections;

public class TestTri {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Île-de-France", "75", "Paris", 2148000));
        villes.add(new Ville("Auvergne-Rhône-Alpes", "69", "Lyon", 513275));
        villes.add(new Ville("Provence-Alpes-Côte d'Azur", "13", "Marseille", 861635));

        Collections.sort(villes);  // Trie les villes par nom

        for (Ville ville : villes) {
            System.out.println(ville);  // Affiche les villes triées par nom
        }
    }
}
