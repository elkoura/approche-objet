package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> liste1 = new ArrayList<>();
		 liste1.add("Rouge");
	        liste1.add("Vert");
	        liste1.add("Orange");
	        List<String> liste2 = new ArrayList<>();
	        liste2.add("blanc");
	        liste2.add("marron");
	        liste2.add("Orange");
	        //TODO
			 List<String> liste3 = new ArrayList<>(liste1);
			 liste3.addAll(liste2);
			 System.out.println("liste fusionner:" +liste3);

	        
		 

	}

}
