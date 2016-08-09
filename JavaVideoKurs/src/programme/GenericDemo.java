package programme;

import klassen.ArrayUtils;
import klassen.Fahrzeug;
import klassen.FahrzeugListe;
import klassen.LKW;
import klassen.Liste;
import klassen.Map;
import klassen.Motorrad;
import klassen.PKW;

public class GenericDemo {

	public static void main(String[] args) {

		// -------------Liste von Fahrzeugen---------------

		Liste<Fahrzeug> fahrzeugListe = new Liste<Fahrzeug>(100);

		fahrzeugListe.add(new PKW(180, "BMW", 33000, 5));
		fahrzeugListe.add(new Motorrad(120, "Suzuki", 13000));

		System.out.println("Fahrzeuge in Liste: " + fahrzeugListe.getElementCount());

		Fahrzeug f = fahrzeugListe.get(1);
		System.out.println(f);

		// -------------Liste von Strings--------------------

		Liste<String> herstellerListe = new Liste<String>(100);
		
		herstellerListe.add("Audi");
		herstellerListe.add("BMW");
		herstellerListe.add("Mercedes");
		
		System.out.println("Hersteller in Liste: " + herstellerListe.getElementCount());
		String hersteller = (String) herstellerListe.get(2);
		
		System.out.println(hersteller);	
		
		//--------------Mapping------------------
		
		Map<String, String> map = new Map<String, String>();
		Map<Fahrzeug, String> map2 = new Map<Fahrzeug, String>();
		
		Liste<String> liste = ArrayUtils.<String>arrayToList(new String[] {"Hallo","Hi"});
		
		//--------------Fahrzeug-Liste--------------------
		FahrzeugListe<PKW> fahrzeuge = new FahrzeugListe <PKW> (100);
		FahrzeugListe<LKW> fahrzeuge2 = new FahrzeugListe <LKW> (100);
		
		Object o = new String();
		Liste<Object> objListe = new Liste<Object>(100);
		Liste<String> strListe = new Liste<String>(100);
		
		int i = ArrayUtils.getRemainingSlots(strListe);
		

	}

}
