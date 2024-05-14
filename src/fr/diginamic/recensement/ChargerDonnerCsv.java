package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ChargerDonnerCsv {
    public static List<City> chargerUneville() {
        List<City> cities = new ArrayList<>();
        String filePath = "C:\\Users\\fouad\\OneDrive\\Documents\\Java2024\\approche-objet\\src\\fr\\diginamic\\recensement\\recensement.csv";

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (int i = 1; i < lines.size(); i++) {
                String[] data = lines.get(i).split(";");
                if (data.length >= 10) {
                	int populationMunicipale = Integer.parseInt(data[7].replace(" ", ""));
                	int populationCompteeAPart = Integer.parseInt(data[8].replace(" ", ""));
                	int populationTotale = Integer.parseInt(data[9].replace(" ", ""));

                    City city = new City(data[0], data[1], data[2], data[3], data[4], data[5], data[6],
                                         populationMunicipale, populationCompteeAPart, populationTotale);
                    cities.add(city);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cities;
    }
}
