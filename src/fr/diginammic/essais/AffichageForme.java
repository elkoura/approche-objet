package fr.diginammic.essais;

import fr.diginammic.formes.Form;

//cette classe possède une méthode afficher qui a un paramètre de type Forme.


public class AffichageForme {
    public void afficher(Form forme) {
        System.out.println("Périmètre: " + forme.calculerPerimetre());
        System.out.println("Surface: " + forme.calculerSurface());
    }
}

