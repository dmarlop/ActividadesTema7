package actividad1.zoo.mamifero;

public class Herbivoro extends Mamifero{

	private String tipoDeDieta;
	
	public Herbivoro(double peso, double tamano, int numeroDePatas, String tipoDePelaje, String tipoDeDieta) {
		super(peso, tamano, numeroDePatas, tipoDePelaje);
		this.tipoDeDieta = tipoDeDieta;
	}
	
	public void setTipoDeDieta(String tipoDeDieta) {
		this.tipoDeDieta = tipoDeDieta;
	}
	
	public String getTipoDeDieta() {
		return tipoDeDieta;
	}
	
	@Override
	public void comer() {
		System.out.println("Como hierbas");
		
	}
	
	public void pastar() {
		System.out.println("Estoy pastando por el campo");
	}
	
	@Override
	public String toString() {
		return "Herbivoro [tamaño=" + this.getTamano() + ", peso=" + this.getPeso() + ", con Numero de patas=" + this.getNumeroDePatas() + "y tipo de pelaje=" + this.gettipoDePelaje() + "con un tipo de dieta=" + this.tipoDeDieta +"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Herbivoro nuevoHerbivoro = (Herbivoro) obj;
		boolean result = false;
		
		if(super.equals(nuevoHerbivoro) && this.tipoDeDieta.equals(nuevoHerbivoro.tipoDeDieta)) {
			result = true;
		}
		return result;
	}
	
	
	
	
	
	
}
