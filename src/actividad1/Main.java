package actividad1;

import actividad1.zoo.mamifero.Carnivoro;
import actividad1.zoo.mamifero.Mamifero;

public class Main {

	public static void main(String[] args) {
		/*
		 *Crea varios objetos de cada cosa
		 */
		Mamifero m1 = new Mamifero (51.2, 1.62, 4, "Peludo");
		Mamifero m2 = new Mamifero (60, 1.78, 4, "No Peludo");
		Mamifero m3 = new Mamifero (80, 1.25, 4, "Pelo Rizado");
		Carnivoro c1 = new Carnivoro (90, 1.62, 4, "Peludo", "Muy agresivo");
		
		
		System.out.println(m1.toString());
		System.out.println(c1.toString());
	}

}
