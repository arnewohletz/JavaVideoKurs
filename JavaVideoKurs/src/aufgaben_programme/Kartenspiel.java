package aufgaben_programme;

import java.awt.Color;

import aufgaben_klassen.Karte;

public class Kartenspiel {

	public static void main(String[] args) {
		
		Karte k1 = new Karte(2,Color.RED);
		Karte k2 = new Karte(6,Color.BLUE);
		Karte k3 = k1.clone();
		
		System.out.println(k1.toString());
		System.out.println(k3.toString());
		System.out.println(k1.equals(k3));
		
		k3.setFarbe(Color.GREEN);
		k3.setZahl(8);
		System.out.println(k1.equals(k3));
		
	}

}
