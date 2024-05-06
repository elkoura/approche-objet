package fr.diginammic.entities;

	public class Theatre {
		private String nom;
		private int capMax;
		private int totalClient;
		private double recetTotal;
		public Theatre (String nom, int capMax) {
			this.nom=nom;
			this.capMax=capMax;
			this.totalClient=0;
			this.recetTotal=0;
	}
		public void Inscrits(int Nbclient,double prixPlace ) {
	    	if (totalClient + Nbclient <= capMax) {
	            totalClient += Nbclient;
	            recetTotal += Nbclient * prixPlace;
	        }
			else {
			System.out.println("erreur");
			}
		}
		
		
	
	    public int getTotalClients() {
	    	return totalClient;
}

	    public double getRecetteTotale() {
	    	return recetTotal;
	    }
	}

