package fr.diginamic.recensement;


import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Entrez le nom de la ville : ");
        String nomVille = scanner.nextLine();
        boolean trouve = false;
        for (City city : recensement.getCities()) {
            if (city.getNomCommune().equalsIgnoreCase(nomVille)) {
                System.out.println("Population de " + nomVille + " : " + city.getPopulationTotale());
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Ville non trouvée.");
        }
    }
}
