package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ville> villes = new ArrayList<>(); // Initialisation de la liste des villes
        villes.add(new Ville("New York", 8419000, Continent.AMERIQUE)); 
        villes.add(new Ville("Paris", 2148000, Continent.EUROPE)); // 
        villes.add(new Ville("Pékin", 21540000, Continent.ASIE)); // 
        villes.add(new Ville("Moscou", 11920000, Continent.EUROPE)); 
        villes.add(new Ville("Berlin", 3645000, Continent.EUROPE));
        villes.add(new Ville("Sydney", 5230000, Continent.OCEANIE)); 
        villes.add(new Ville("Sao Paulo", 12300000, Continent.AMERIQUE)); 
        villes.add(new Ville("Dakar", 1030000, Continent.AFRIQUE));
        for (Ville ville : villes) { 
            System.out.println(ville);
        }

	}
}
