package fr.diginamic.banque.entities;

public class TestOperation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Operation[] operations= {
				 new Credit("2024-01-01", 1000),
		            new Debit("2024-01-02", 500),
		            new Credit("2024-01-03", 700),
		            new Debit("2024-01-04", 300)		
		            };
		double solde =0;
		for (Operation operation : operations) {
			System.out.println(operation.getDate()+"-" + operation.getType()+ operation.getMontant());
			if(operation.getType().equals("CREDIT")) {
				solde += operation.getMontant();
			}
			else {
				solde-=operation.getMontant();
			}
			System.out.println("solde final" + solde );
		}

	}

}
