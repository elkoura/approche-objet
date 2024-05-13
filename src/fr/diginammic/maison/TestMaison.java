package fr.diginammic.maison;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(15.0, 1));
        maison.ajouterPiece(new Cuisin(12.0, 0));
        maison.ajouterPiece(new Salon(20.0, 0));
        maison.ajouterPiece(new WC(5.0, 0));

        System.out.println("Superficie totale: " + maison.getSuperficieTotale());
        System.out.println("Superficie RDC: " + maison.getSuperficieParEtage(0));
        System.out.println("Superficie des chambres: " + maison.getSuperficieParTypePiece(Chambre.class));
        System.out.println("Nombre de chambres: " + maison.getNbPiecesParTypePiece(Chambre.class));
    }
}
