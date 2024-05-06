package fr.diginammic.operations;



public class Operations {
	public static double calcul(double a, double b, char operateur) {
		 switch (operateur) {
         case '+':
             return a + b;
         case '-':
             return a - b;
         case '*':
             return a * b;
         case '/':
             if (b != 0) {
                 return a / b;
             } else {
                 System.out.println("Division par zéro !");
                 return Double.NaN;
             }
         default:
             System.out.println("Opérateur non valide !");
             return Double.NaN;
	}

	}
}
