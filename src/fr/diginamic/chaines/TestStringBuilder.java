package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testStringbuilder();
		testStringConcat();
	}
		


		private static void testStringbuilder() {
		// TODO Auto-generated method stub
			long debut=System.currentTimeMillis();
			StringBuilder sb=new StringBuilder();
			  for (int i = 1; i <= 100000; i++) {
		            sb.append(i);
		        }
			  long fin = System.currentTimeMillis();
		        System.out.println("Temps d'exécution avec StringBuilder: " + (fin - debut) + " ms");
			
		
	}
		private static void testStringConcat() {
			long debut2=System.currentTimeMillis();
			String str="";
			for (int i = 1; i <= 100000; i++) {
	            str += i;
	        }
			long fin = System.currentTimeMillis();
	        System.out.println("Temps d'exécution avec String et opérateur +: " + (fin - debut2) + " ms");
			
		
		
		
	}

}
