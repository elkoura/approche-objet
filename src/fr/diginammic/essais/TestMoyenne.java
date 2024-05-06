package fr.diginammic.essais;
import fr.diginammic.operations.CalculMoyenne;


public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne calcul1=new CalculMoyenne();
		calcul1.ajout(1);
		calcul1.ajout(13);
        calcul1.ajout(14);
        calcul1.ajout(15);
        System.out.println("Moyenne 1: " + calcul1.calcul());

        CalculMoyenne calcul2 = new CalculMoyenne();
        calcul2.ajout(5);
        calcul2.ajout(15);
        calcul2.ajout(25);
        System.out.println("Moyenne 2: " + calcul2.calcul());
    }

		
		

	}
