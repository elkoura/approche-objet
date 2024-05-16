package fr.diginamic.testenumeration;

public enum Continent {
	 AFRIQUE("Afrique"), // 
	    AMERIQUE("Amérique"),
	    ASIE("Asie"), // 
	    EUROPE("Europe"), 
	    OCEANIE("Océanie");
	
	private String libelle;

	/**
	 * @param libelle
	 */
	private Continent(String libelle) {
		this.libelle = libelle;
	}
	 public String getLibelle() {
	        return libelle;
	    }

}
