package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<>();
		liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);
        System.out.println("Liste initiale : " + liste);
        System.out.println("Liste size : " + liste.size());
		
        int max = Collections.max(liste);//le plus grand de la liste
        System.out.println("max de la liste : " + max);// le pluspetit de la liste 
        
        
        int min = Collections.min(liste);
        liste.remove(Integer.valueOf(min));
        System.out.println("la liste apres la suppression du plus petit élement " + liste );
        
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set(i, Math.abs(liste.get(i)));
            }
        }
        System.out.println("Liste après conversion des éléments négatifs : " + liste);
			
		}
	}


