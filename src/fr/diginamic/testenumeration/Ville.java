package fr.diginamic.testenumeration;

public class Ville {
	private String nom; // Attribut pour le nom de la ville
    private int population; // Attribut pour la population de la ville
    private Continent continent;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/**
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	/**
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	/**
	 * @param nom
	 * @param population
	 * @param continent
	 */
	public Ville(String nom, int population, Continent continent) {
		super();
		this.nom = nom;
		this.population = population;
		this.continent = continent;
		
	}
	@Override
	public boolean equals(obj instansof)
	 @Override
	    public String toString() {
	        return "Ville{" +
	                "nom='" + nom + '\'' +
	                ", population=" + population +
	                ", continent=" + continent.getLibelle() +
	                '}';
	 }
}
