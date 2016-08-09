package programme;

import klassen.Dackel;
import klassen.PKW;
import klassen.WarenBestand;

public class WarenBestandDemo {

	public static void main(String[] args) {

		PKW pkw = new PKW(150, "BMW", 20000, 5);
		Dackel dackel = new Dackel(850);

		WarenBestand.hinzufuegen(pkw);
		WarenBestand.hinzufuegen(dackel);

		System.out.println("Gesamteinnahmen aus " + WarenBestand.getAnzahlWaren() + " Waren: "
				+ WarenBestand.berechneGesamtEinnahmen());
	}

}
