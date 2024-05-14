package fr.diginamic.recensement;

public class City implements Comparable<City> {
    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeArrondissement;
    private String codeCanton;
    private String codeCommune;
    private String nomCommune;
    private int populationMunicipale;
    private int populationCompteeAPart;
    private int populationTotale;

    public City(String codeRegion, String nomRegion, String codeDepartement, String codeArrondissement,
                String codeCanton, String codeCommune, String nomCommune, int populationMunicipale,
                int populationCompteeAPart, int populationTotale) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeArrondissement = codeArrondissement;
        this.codeCanton = codeCanton;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationMunicipale = populationMunicipale;
        this.populationCompteeAPart = populationCompteeAPart;
        this.populationTotale = populationTotale;
    }

    @Override
    public int compareTo(City other) {
        return this.nomCommune.compareTo(other.nomCommune);
    }

    @Override
    public String toString() {
        return String.format("City{%s, %s, %s, Pop: %d}", nomRegion, codeDepartement, nomCommune, populationTotale);
    }

    public String getCodeRegion() { return codeRegion; }
    public String getNomRegion() { return nomRegion; }
    public String getCodeDepartement() { return codeDepartement; }
    public String getCodeArrondissement() { return codeArrondissement; }
    public String getCodeCanton() { return codeCanton; }
    public String getCodeCommune() { return codeCommune; }
    public String getNomCommune() { return nomCommune; }
    public int getPopulationMunicipale() { return populationMunicipale; }
    public int getPopulationCompteeAPart() { return populationCompteeAPart; }
    public int getPopulationTotale() { return populationTotale; }

    
}
