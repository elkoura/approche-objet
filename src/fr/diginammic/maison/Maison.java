package fr.diginammic.maison;

import java.util.ArrayList;
import java.util.List;

public class Maison {
    private List<Piece> pieces = new ArrayList<>();

    public void ajouterPiece(Piece piece) {
        if (piece != null && piece.superficie >= 0 && piece.etage >= 0) {
            pieces.add(piece);
        }
    }

    public double getSuperficieTotale() {
        double total = 0;
        for (Piece piece : pieces) {
            total += piece.superficie;
        }
        return total;
    }

    public double getSuperficieParEtage(int etage) {
        double total = 0;
        for (Piece piece : pieces) {
            if (piece.etage == etage) {
                total += piece.superficie;
            }
        }
        return total;
    }

    public double getSuperficieParTypePiece(Class<?> type) {
        double total = 0;
        for (Piece piece : pieces) {
            if (type.isInstance(piece)) {
                total += piece.superficie;
            }
        }
        return total;
    }

    public int getNbPiecesParTypePiece(Class<?> type) {
        int count = 0;
        for (Piece piece : pieces) {
            if (type.isInstance(piece)) {
                count++;
            }
        }
        return count;
    }
}
