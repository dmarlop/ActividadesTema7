package actividad1;

import actividad1.zoo.mamifero.Carnivoro;
import actividad1.zoo.mamifero.Mamifero;

public class Main {

	public static void main(String[] args) {
		/*
		 *Crea varios objetos de cada cosa
		 */
		Mamifero m1 = new Mamifero (51.2, 1.62, 4, "Peludo");
		Mamifero m2 = new Mamifero (51.2, 1.62, 4, "Peludo");
		Mamifero m3 = new Mamifero (51.2, 1.62, 4, "Peludo");
		Carnivoro c1 = new Carnivoro (90, 1.62, 4, "Peludo", "Muy agresivo");
		
		
		System.out.println(m1.toString());
		System.out.println(c1.toString());
		System.out.println(m1.equals(m3));
	}

}
