package fr.diginammic.entities;

public class Cercle {
	private double rayon;
	public Cercle(double rayon) {
		this.rayon=rayon;
	}
	
	public double CalculePerimetre() {
		return  2 * Math.PI * rayon;
	}
	public double CalculeSurface() {
		return  Math.PI * rayon *rayon;
	}
	
}	


