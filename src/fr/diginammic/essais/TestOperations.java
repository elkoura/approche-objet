package fr.diginammic.essais;

import fr.diginammic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double addition = Operations.calcul(10, 5, '+');
        double soustraction = Operations.calcul(10, 5, '-');
        double multiplication = Operations.calcul(10, 5, '*');
        double division = Operations.calcul(10, 5, '/');

        System.out.println("Addition: " + addition);
        System.out.println("Soustraction: " + soustraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
