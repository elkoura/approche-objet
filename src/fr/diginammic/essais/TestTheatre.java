package fr.diginammic.essais;

import fr.diginammic.entities.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre theatre = new Theatre("Théâtre de fouad	", 1000);

        theatre.Inscrits(30, 12.5); // class.methode la methode ici icrite avec les deux parametres (nb de client et prix de place 
        theatre.Inscrits(50, 16);
        theatre.Inscrits(20, 20);
        theatre.Inscrits(10, 18);
        System.out.println("total de cliet est :"+ theatre.getTotalClients());
        System.out.println("recette totale de l etablissemnet" + theatre.getRecetteTotale());

	}

}
