package programme;

import klassen.Motorrad;
import klassen.Spielstand;

public class CloneDemo {

	static Spielstand aktuellerSpielstand;
	static Spielstand gesicherterSpielstand;

	public static void main(String[] args) {

		aktuellerSpielstand = new Spielstand();
		aktuellerSpielstand.punkte = 1000;
		aktuellerSpielstand.fahrzeug = new Motorrad(120, "Suzuki", 20000);

		// Spieler spielt...

		sichereSpielstand();
		zeigeSpielstaende();
		
		aktuellerSpielstand.punkte = 1500;
		aktuellerSpielstand.fahrzeug.tunen(200);
		
		zeigeSpielstaende();

	}

	static void sichereSpielstand() {
		// TODO: aktuellen Spielstand klonen und als gesicherten Spielstand
		// speichern
		Spielstand klon = aktuellerSpielstand.clone();
		gesicherterSpielstand = klon;
	}

	static void ladeSpielstand() {
		aktuellerSpielstand = gesicherterSpielstand;
	}

	static void zeigeSpielstaende(){
		System.out.println("Aktuell: " + aktuellerSpielstand);
		System.out.println("Gespeichert: " + gesicherterSpielstand);
	}
	
}
