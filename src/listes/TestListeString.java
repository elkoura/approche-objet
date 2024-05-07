package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listeVille = new ArrayList<>();
		Collections.addAll(listeVille, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
		Iterator<String> iter = listeVille.iterator();
		String city = "";
		int max = 0;

		while (iter.hasNext()) {
		    String nextCity = iter.next();
		    if (nextCity.length() > max) {
		        city = nextCity;
		        max = nextCity.length();
		    }
		}
		System.out.println("Ville avec le plus grand nombre de lettres : " + city);
		 iter = listeVille.iterator();
	        while (iter.hasNext()) {
	            String ville = iter.next();
	            int index = listeVille.indexOf(ville);
	            listeVille.set(index, ville.toUpperCase());
	        }
	        System.out.println("Liste en majuscules : " + listeVille);
	        
	        
	        
	        iter = listeVille.iterator();
	        while (iter.hasNext()) {
	            String ville = iter.next();
	            if (ville.startsWith("N")) {
	                iter.remove();
	            }
	        }

	        System.out.println("Liste après suppression des villes commençant par N : " + listeVille);
	}

}
