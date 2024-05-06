package fr.diginammic.formes;

public class Carre extends Form {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public double calculerSurface() {
        return cote * cote;
    }

    @Override
    public double calculerPerimetre() {
        return 4 * cote;
    }
}