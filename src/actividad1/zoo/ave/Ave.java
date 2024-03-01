package actividad1.zoo.ave;

import actividad1.zoo.Animal;

public class Ave extends Animal {

	
	private String tipoDeAlas;
	private double longitudDeAlas;
	
	public Ave(double peso, double tamano, String tipoDeAlas, double longitudDeAlas) {
		super(peso, tamano);
		this.tipoDeAlas = tipoDeAlas;
		this.longitudDeAlas = longitudDeAlas;
		
		
	}
	
	

	public String getTipoDeAlas() {
		return tipoDeAlas;
	}



	public void setTipoDeAlas(String tipoDeAlas) {
		this.tipoDeAlas = tipoDeAlas;
	}



	public double getLongitudDeAlas() {
		return longitudDeAlas;
	}



	public void setLongitudDeAlas(double longitudDeAlas) {
		this.longitudDeAlas = longitudDeAlas;
	}



	@Override
	public void desplazarse() {
		System.out.println("Me desplazo dando saltitos porque soy un ave");
		
	}

	@Override
	public void comer() {
		System.out.println("Como con el pico porque soy un ave");
		
	}
	
	public void volar() {
		System.out.println("Me desplazo volando porque soy voladora");
	}
	
	public void cantar() {
		System.out.println("Canto porque soy un ave cantor");
	}
	
	@Override
	public String toString() {
		return "Ave [tamaño=" + this.getTamano() + ", peso=" + this.getPeso() + "un tipo de alas=" + this.tipoDeAlas + "y una longitud de alas de=" + this.longitudDeAlas + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Ave nuevoAve = (Ave) obj;

		boolean result = false;

		if (super.equals(nuevoAve) && this.tipoDeAlas.equals(nuevoAve) && this.longitudDeAlas == nuevoAve.longitudDeAlas) {
			result = true;
		}
		return result;
	}
	
}
