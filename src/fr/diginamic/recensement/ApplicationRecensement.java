package fr.diginamic.recensement;

import fr.diginamic.recensement.*;
import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recensement recensement = new Recensement(ChargerDonnerCsv.chargerUneville());

        while (true) {
            System.out.println("Choisissez une option svp :");
            System.out.println("1 Population d’une ville donnée");
            System.out.println("2 Population d’un département donné");
            System.out.println("3 Population d’une région donnée");
            System.out.println("4 Afficher les 10 régions les plus peuplées");
            // Et ainsi de suite pour les autres options
            System.out.println("9 Sortir");

            int choix = Integer.parseInt(scanner.nextLine());
            switch (choix) {
                case 1:
                    new RecherchePopulationVille().traiter(recensement, scanner);
                    break;
                case 2:
                    new RecherchePopulationDepartement().traiter(recensement, scanner);
                    break;
                case 3:
                    new RecherchePopulationRegion().traiter(recensement, scanner);
                    break;
                case 4:
                    new Top10RegionsPlusPeuplees().traiter(recensement, scanner);
                    break;
                // Ajoutez d'autres cases ici pour les autres options
                case 9:
                    System.out.println("Fin du program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option non validee.");
                    break;
            }
        }
    }
}
