package klassen;

public class FahrzeugBestand {

	private static Fahrzeug[] fahrzeuge = new Fahrzeug[100];
	private static int fCounter = 0;
	private static int anzahl = 0;

//	private static PKW[] pkws = new PKW[100];
//	private static LKW[] lkws = new LKW[100];
//	private static Motorrad[] motorraeder = new Motorrad[100];
//
//	private static int pkwCounter = 0;
//	private static int lkwCounter = 0;
//	private static int motorradCounter = 0;

	public static void hinzufuegen(Fahrzeug fahrzeug) {
		if (fCounter < fahrzeuge.length) {
			fahrzeuge[fCounter++] = fahrzeug;
		}
	}
	
	public static int getAnzahlPKW(){
		for (Fahrzeug f : fahrzeuge)
		if (f instanceof PKW){
			anzahl++;
		}
		return anzahl;
	}

//	public static void hinzufuegen(PKW pkw) {
//		if (pkwCounter < pkws.length) {
//			pkws[pkwCounter++] = pkw;
//		}
//	}
//
//	public static void hinzufuegen(LKW lkw) {
//		if (lkwCounter < lkws.length) {
//			lkws[lkwCounter++] = lkw;
//		}
//	}
//
//	public static void hinzufuegen(Motorrad motorrad) {
//		if (motorradCounter < motorraeder.length) {
//			motorraeder[motorradCounter++] = motorrad;
//		}
//	}

	public static int getAnzahlFahrzeuge() {
		return fCounter;
		//return pkwCounter + lkwCounter + motorradCounter;
	}

	
	
	public static int berechneGesamtEinnahmen() {
		int total = 0;

		for (Fahrzeug f : fahrzeuge) {
			if (f == null) {
				break;
			}
			total += f.getPreis();
		}
		
//		for (PKW pkw : pkws) {
//			if (pkw == null) {
//				break;
//			}
//			total += pkw.getPreis();
//		}
//		for (LKW lkw : lkws) {
//			if (lkw == null) {
//				break;
//			}
//			total += lkw.getPreis();
//		}
//		for (Motorrad motorrad : motorraeder) {
//			if (motorrad == null) {
//				break;
//			}
//			total += motorrad.getPreis();
//		}

		return total;
	}
}
