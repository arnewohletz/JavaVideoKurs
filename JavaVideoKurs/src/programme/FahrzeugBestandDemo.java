package programme;

import klassen.Fahrzeug;
import klassen.FahrzeugBestand;
import klassen.LKW;
import klassen.Motorrad;
import klassen.PKW;

public class FahrzeugBestandDemo {

	public static void main(String[] args) {
		
		PKW pkw1 = new PKW();
		pkw1.setPreis(15000);
		pkw1.setAnzahlTueren(5);
		
		Fahrzeug f = pkw1;
		
		PKW pkw2 = new PKW();
		pkw2.setPreis(20000);
		PKW pkw3 = new PKW();
		pkw3.setPreis(25000);
		
		Motorrad m1 = new Motorrad(100,"Kawasaki", 20000);
		m1.setPreis(10000);
		Motorrad m2 = new Motorrad(120,"Honda", 23000);
		m2.setPreis(12000);
		Motorrad m3 = new Motorrad(140,"Harley-Davidson", 26000);
		m3.setPreis(13000);
		
		LKW lkw1 = new LKW(500, "MAN", 120000);
		lkw1.setPreis(50000);
		LKW lkw2 = new LKW(550, "Mercedes", 130000);
		lkw2.setPreis(60000);
		LKW lkw3 = new LKW(600, "Volvo", 140000);
		lkw3.setPreis(70000);
		
		FahrzeugBestand.hinzufuegen(pkw1);
		FahrzeugBestand.hinzufuegen(pkw2);
		FahrzeugBestand.hinzufuegen(pkw3);
		FahrzeugBestand.hinzufuegen(lkw1);
		FahrzeugBestand.hinzufuegen(lkw2);
		FahrzeugBestand.hinzufuegen(lkw3);
		FahrzeugBestand.hinzufuegen(m1);
		FahrzeugBestand.hinzufuegen(m2);
		FahrzeugBestand.hinzufuegen(m3);
		
		System.out.println("Gesamteinnahmen aus " + FahrzeugBestand.getAnzahlFahrzeuge() + 
				" Fahrzeugen: " + FahrzeugBestand.berechneGesamtEinnahmen());
		
		System.out.println("Anzahl PKW aus Bestand: " + FahrzeugBestand.getAnzahlPKW());
	}

}
