package fr.diginammic.essais;
import fr.diginammic.salaire.Salarie;
import fr.diginammic.salaire.Pigiste; 
import fr.diginammic.salaire.Intervenant;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intervenant salarie = new Salarie("Belbey", "karine", 2000);
		Intervenant pigiste = new Pigiste("fouad", "elkoura", 15, 140.0, 30); 
		
		salarie.afficherDonner();
        System.out.println("***********************************************");
        pigiste.afficherDonner();
		

	}

}
