package actividad1.zoo.mamifero;

public class Carnivoro extends Mamifero {

	private String nivelDeAgresividad;

	public Carnivoro(double peso, double tamano, int numeroDePatas, String tipoDePelaje, String nivelDeAgresividad) {
		super(peso, tamano, numeroDePatas, tipoDePelaje);
		this.nivelDeAgresividad = nivelDeAgresividad;
	}

	public void setNivelDeAgresividad(String nivelDeAgresividad) {
		this.nivelDeAgresividad = nivelDeAgresividad;

	}

	public String getNivelDeAgresividad() {
		return nivelDeAgresividad;
	}

	@Override
	public void comer() {
		System.out.println("Como carne");
		
	}
	
	public void rugir() {
		System.out.println("Estoy rugiendo");
	}
	
	@Override
	public String toString() {
		return "Carnivoro [tamaño=" + this.getTamano() + ", peso=" + this.getPeso() + ", con Numero de patas=" + this.getNumeroDePatas() + "y tipo de pelaje=" + this.gettipoDePelaje() + "con un nivel de agresividad=" + this.nivelDeAgresividad +"]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Carnivoro nuevoCarnivoro = (Carnivoro) obj;
		boolean result = false;
		
		if(super.equals(nuevoCarnivoro) && this.nivelDeAgresividad.equals(nuevoCarnivoro.nivelDeAgresividad)) {
			result = true;
		}
		return result;
	}
	
}
