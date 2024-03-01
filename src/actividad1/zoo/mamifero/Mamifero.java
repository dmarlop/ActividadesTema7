package actividad1.zoo.mamifero;

import actividad1.zoo.Animal;

public class Mamifero extends Animal {


	private int numeroDePatas;
	private String tipoDePelaje;
	
	public Mamifero(double peso, double tamano, int numeroDePatas, String tipoDePelaje) {
		super(peso,tamano);
		this.numeroDePatas = numeroDePatas;
		this.tipoDePelaje = tipoDePelaje;
	}
	
	public int getNumeroDePatas() {
		return numeroDePatas;
	}
	
	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}
	
	public String gettipoDePelaje() {
		return tipoDePelaje;
	}
	
	public void setTipoDePelaje(String tipoDePelaje) {
		this.tipoDePelaje = tipoDePelaje;
	}

	
	public void amamantar() {
		System.out.println("Amamanto");
	}
	public void correr() {
		System.out.println("Estoy corriendo");
	
	}

	@Override
	public void desplazarse() {
		System.out.println("Me desplazo corriendo o andando");
		
	}

	@Override
	public void comer() {
		System.out.println("Como amamantando");
		
	}
	
	
	@Override
	public String toString() {
		return "Mamífero [tamaño=" + this.getTamano() + ", peso=" + this.getPeso() + ", con Numero de patas=" + this.numeroDePatas + "y tipo de pelaje=" + this.tipoDePelaje +"]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Mamifero nuevoMamifero = (Mamifero) obj;
		boolean result = false;
		
		if(super.equals(nuevoMamifero) && this.numeroDePatas == nuevoMamifero.numeroDePatas && this.tipoDePelaje.equals(nuevoMamifero.tipoDePelaje)) {
			result = true;
		}
		return result;
	}
	
	
}
