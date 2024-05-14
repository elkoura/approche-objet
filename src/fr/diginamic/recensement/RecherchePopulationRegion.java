package fr.diginamic.recensement;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Entrez le nom de la région : ");
        String nomRegion = scanner.nextLine();
        int totalPopulation = recensement.getCities().stream()
            .filter(c -> c.getNomRegion().equalsIgnoreCase(nomRegion))
            .mapToInt(City::getPopulationTotale)
            .sum();

        if (totalPopulation > 0) {
            System.out.println("Population totale de la région " + nomRegion + " : " + totalPopulation);
        } else {
            System.out.println("Région non trouvée.");
        }
    }
}
