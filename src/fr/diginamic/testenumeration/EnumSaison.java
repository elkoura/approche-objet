package fr.diginamic.testenumeration;

public enum EnumSaison {
	
	PRINTEMPS("printemp",1),
	ETE("ete", 2),
	AUTOMNE("automne", 3),
	HIVER("hiver", 4);
	
	private String liblle;
	private int numero;
	
	

	/**
	 * @param liblle
	 * @param numero
	 */
	EnumSaison(String liblle, int numero) {
		this.liblle = liblle;
		this.numero = numero;
	}

	/**
	 * @return the liblle
	 */
	public String getLiblle() {
		return liblle;
	}



	/**
	 * @return the ordre
	 */
	public int getNumero() {
		return numero;
	}
	//pour trouver une saison avec son libellé
	
	public static EnumSaison getByLibelle(String liblle) {
		
		for (EnumSaison saison : values()) {
			if(saison.getLiblle().equalsIgnoreCase(liblle)) {
				return saison;
			}
		}
		return null;
			}
			
		
	}

	



	

	
	

