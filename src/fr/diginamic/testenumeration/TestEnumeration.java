package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(EnumSaison saison:EnumSaison.values()) {
			System.out.println(saison);
		}
		
		String nom="ETE";
		EnumSaison saisonNom=EnumSaison.valueOf(nom);
		System.out.println("la saison avec le nom "+ nom + "a le lible" +  saisonNom.getLiblle());
		
		
		
	}

}
