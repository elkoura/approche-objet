package fr.diginammic.essais;
import fr.diginammic.formes.Cercle;
import fr.diginammic.formes.Form;
import fr.diginammic.formes.Rectangle;
import fr.diginammic.formes.Carre;
//cette classe possède une méthode afficher qui a un paramètre de type Forme.


public class AffichageForme {
    public void afficher(Form forme) {
        System.out.println("Périmètre: " + forme.calculerPerimetre());
        System.out.println("Surface: " + forme.calculerSurface());
    }
}

