package actividad1.zoo;



public abstract class Animal {
	
	private double peso;
	
	private double tamano;
	
	public Animal(double peso, double tamano) {
		this.peso = peso;
		this.tamano = tamano;		
	}
	

	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}


	public abstract void desplazarse();
	public abstract void comer();
	
	
	@Override
	public String toString() {
		return "Animal [tamaño=" + this.tamano + ", peso]" + this.peso;
	}
	
	@Override
	public boolean equals(Object obj) {
		Animal nuevoAnimal = (Animal) obj;

		boolean result = false;

		if (this.peso == nuevoAnimal.peso && this.tamano == nuevoAnimal.tamano) {
			result = true;
		}
		return result;
	}
	
}
