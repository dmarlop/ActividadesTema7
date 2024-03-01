package actividad1.zoo.ave;

public class Voladora extends Ave {

	private double alturaMaximaVuelo;
	
	public Voladora(double peso, double tamano, String tipoDeAlas, double longitudDeAlas, double alturaMaximaVuelo) {
		super(peso, tamano, tipoDeAlas, longitudDeAlas);
		this.alturaMaximaVuelo = alturaMaximaVuelo;
	}
	
	public void setAlturaMaximaVuelo(double alturaMaximaVuelo){
		this.alturaMaximaVuelo = alturaMaximaVuelo;
	}
	
	public double getAlturaMaximaVuelo() {
		return alturaMaximaVuelo;
	}
	
	@Override
	public String toString() {
		return "Ave [tamaño=" + this.getTamano() + ", peso=" + this.getPeso() + "un tipo de alas=" + this.getTipoDeAlas() + "y una longitud de alas de=" + this.getLongitudDeAlas() + "con una altura máxima de vuelo de=" + this.alturaMaximaVuelo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Voladora nuevoAve = (Voladora) obj;

		boolean result = false;

		if (super.equals(nuevoAve) && this.alturaMaximaVuelo == nuevoAve.alturaMaximaVuelo ) {
			result = true;
		}
		return result;
	}
	
}
