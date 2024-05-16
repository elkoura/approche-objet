package fr.diginamic.recensement;

import java.util.List;
@Data
public class Recensement {
    private List<City> cities;

	/**
	 * @return the cities
	 */
	public List<City> getCities() {
		return cities;
	}

	/**
	 * @param cities the cities to set
	 */
	public void setCities(List<City> cities) {
		this.cities = cities;
	}


}
