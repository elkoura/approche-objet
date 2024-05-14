package fr.diginamic.recensement;

import java.util.List;

public class Recensement {
    private List<City> cities;

    public Recensement(List<City> cities) {
        this.cities = cities;
    }

    public List<City> getCities() {
        return cities;
    }
}
