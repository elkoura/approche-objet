package fr.diginamic.recensement;


import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Entrez le code du département : ");
        String code = scanner.nextLine();
        int totalPopulation = recensement.getCities().stream()
            .filter(c -> c.getCodeDepartement().equals(code))
            .mapToInt(City::getPopulationTotale)
            .sum();

        if (totalPopulation > 0) {
            System.out.println("Population totale du département " + code + " : " + totalPopulation);
        } else {
            System.out.println("Département non trouvé.");
        }
    }
}
