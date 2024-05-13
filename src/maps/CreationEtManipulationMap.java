package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {
	public static void main(String args[]) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
//TODO Développements à réaliser ci-dessous
		mapVilles.put(95, "rhamna");
		mapVilles.put(96, "douar");
		mapVilles.put(97, "hayrahma");
		
		System.out.println("num de departement: ");
		for(Integer key: mapVilles.keySet()) {
        System.out.println(key);
	}
		 System.out.println("Noms des villes:");
		 for (String value : mapVilles.values()) {
	            System.out.println(value);
	            
	        }
		 System.out.println("Taille de la map: " + mapVilles.size());
		

		
	}
	}
