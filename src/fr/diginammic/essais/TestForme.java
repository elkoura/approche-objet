package fr.diginammic.essais;
import fr.diginammic.formes.Carre;
import fr.diginammic.formes.Cercle;
import fr.diginammic.formes.Rectangle;
import fr.diginammic.formes.Form;

public class TestForme {
    public static void main(String[] args) {
        Form cercle = new Cercle(5.0);
        Form rectangle = new Rectangle(10.0, 5.0);
        Form carre = new Carre(4.0);

        AffichageForme affichage = new AffichageForme();
        affichage.afficher(cercle);
        affichage.afficher(rectangle);
        affichage.afficher(carre);
    }
}