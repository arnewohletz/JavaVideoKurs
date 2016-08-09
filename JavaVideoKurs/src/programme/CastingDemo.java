package programme;

import klassen.PKW;

public class CastingDemo {

	public static void main(String[] args) {

		// impliziter Cast -> automatisch: Wertebereich des neuen Datentyp
		// gleich oder größer des bisherigen
		long l = 50; // ganze Zahl bis 2^16 wird automatisch als int gespeichert
		double d = 2; // ganze Zahl bis 2^16 wird automatisch als int
						// gespeichert

		// expliziter Cast -> manuell: auf eigene Verantwortung, dass Werte
		// kompatibel sind
		int i = 1000; // fuktioniert nicht -> Schleife von Min-Max wird
						// durchlaufen bis 1000 erreicht ist
		byte b = (byte) i;
		System.out.println(b); // -24 nach dem Durchlauf der Schleife

		double dou = 4.45;
		int in = (int) dou;
		System.out.println(in); // schneidet Nachkommastellen ab

		// komplexe Datentypen

		// implizit = "upcast" (es wird in einen in der Vererbungshierachie
		// weiter oben liegender Typ gecastet)
		String s = ".....";
		Object o = s;

		// explizit = "downcast" (es wird in einen in der Vererbungshierarchie
		// weiter unten liegender Typ gecastet) -> auf eigene Verantwortung

		// Object o2 = new PKW();
		// s = (String) o2; -> nicht möglich, da o2 ein definitiv auf ein Object
		// und nicht auf String referenziert

		Object o2 = new PKW();
		//s = (String) o2; // -> Möglich, da s ein String ist

		// Prüfung, ob komplexe Datentypen miteinander kompatibel sind

		if (o2 instanceof String) { 
			System.out.println("o2 ist ein String");
			s = (String) o2;
		} else {
			System.out.println("o2 ist kein String");
		}

	}
}
