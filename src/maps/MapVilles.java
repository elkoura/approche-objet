package maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;

class Ville {
    String nom;
    int population;

    Ville(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    @Override
    public String toString() {
        return nom + " (" + population + " habitants)";
    }
}

public class MapVilles {
    public static void main(String[] args) {
      
        HashMap<String, Ville> villes = new HashMap<>();
        villes.put("Nice", new Ville("Nice", 343000));
        villes.put("Carcassonne", new Ville("Carcassonne", 47800));
        villes.put("Narbonne", new Ville("Narbonne", 53400));
        villes.put("Lyon", new Ville("Lyon", 484000));
        villes.put("Foix", new Ville("Foix", 9700));  // La ville avec la population la plus basse
        villes.put("Pau", new Ville("Pau", 77200));
        villes.put("Marseille", new Ville("Marseille", 850700));
        villes.put("Tarbes", new Ville("Tarbes", 40600));

        // le moins d'habitants
        String minKey = Collections.min(villes.entrySet(), Comparator.comparingInt(e -> e.getValue().population)).getKey();

       
        villes.remove(minKey);

      
        System.out.println("Villes restantes après suppression de la ville avec le moins d'habitants:");
        for (Ville ville : villes.values()) {
            System.out.println(ville);
        }
    }
}
