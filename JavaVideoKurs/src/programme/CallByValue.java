package programme;

import klassen.Auto;

public class CallByValue {

	public static void main(String[] args) {

		int a = 10;
		doStuff(a); // Wert von a wird in eine neue Variable a kopiert
		System.out.println("Nach der Methode ohne Rückgabe: " + a);
		a = doOtherStuff(a);
		System.out.println("Nach der Methode mit Rückgabe: " + a);

		Auto b = new Auto(180, "Audi");
		doStuff(b); // ebenso bei komplexem Datentypen -> doStuff() verändert
					// nicht das bereits
		// erstellte Objekt
		System.out.println(b.getLeistung()); // 180, nicht 220
		b = doStuffWithReturn(b);
		System.out.println(b.getLeistung());

		doOtherStuff(b);
		System.out.println(b.getLeistung());

	}

	static void doStuff(int i) { // Kopie von i ist hier eine lokale Variable

		i *= 2;
		System.out.println("In der Methode: " + i);

	}

	static void doStuff(Auto auto) {
		auto = new Auto(220, "BMW"); // die Leistung des neuen Objekts

	}
	
	static Auto doStuffWithReturn(Auto auto) {
		auto = new Auto(220, "BMW");
		return auto;
		
	}

	static void doOtherStuff(Auto auto) {
		auto.tunen(500);
	}
	
	static int doOtherStuff(int i){
		i *= 2;
		return i;
	}
}
