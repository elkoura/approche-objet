package fr.diginamic.recensement;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import java.util.Scanner;
import java.util.Map;
import java.util.stream.Collectors;

public class Top10RegionsPlusPeuplees extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Les 10 régions les plus peuplées :");
        recensement.getCities().stream()
            .collect(Collectors.groupingBy(City::getNomRegion, Collectors.summingInt(City::getPopulationTotale)))
            .entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .limit(10)
            .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
