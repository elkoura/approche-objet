package tp4_Methodes_statics;

public class TestMethodeStatique {
	public static void main(String[] args) {
		String chaine="12";
		int nombre = Integer.parseInt(chaine);
		System.out.println(nombre);
		
		int a=11;
		int b=22;
		int maximum = Integer.max(a, b);
		System.out.println("Le maximum entre " + a + " et " + b + " est " + maximum);
	}

}
