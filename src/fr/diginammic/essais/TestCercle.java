package fr.diginammic.essais;
import fr.diginammic.entities.Cercle;


public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle1=new Cercle(0.5);
		Cercle cercle2 = new Cercle(10.0);
		System.out.println("Cercle 1 - Périmètre: " + cercle1.CalculePerimetre() + ", Surface: " + cercle1.CalculeSurface());
        System.out.println("Cercle 2 - Périmètre: " + cercle2.CalculePerimetre() + ", Surface: " + cercle2.CalculeSurface());

	}

}
