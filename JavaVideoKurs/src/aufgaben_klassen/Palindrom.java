package aufgaben_klassen;

public class Palindrom {

	private static boolean palindrom = false;
	private static String sVorne;
	private static String sHinten;

	public static boolean istPalindrom(String s) {

//		// Musterlösung
//		
//		//Prüfe ob String nicht null ist
//		if (s == null) {
//			throw new IllegalArgumentException("String ist null.");
//		}
//		//Kleinbuchstaben + Leerzeichen löschen kombiniert
//		s = s.toLowerCase().replace(" ", "");
//		
//		//Schließe Strings mit nur einem Zeichen aus
//		if (s.length() < 2) {
//			return false;
//		}
//		//Prüfe, ob String ein Palindrom ist
//		for (int i = 0; i < s.length() / 2; i++) {
//			if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
//				return false;
//			}
//		}
//		return true;

		// Kovertiere String in Kleinbuchstaben
		s = s.toLowerCase();

		// Lösche alle Leerzeichen
		s = s.replaceAll(" ", "");

		// Teile String in vorderen Teil und hinteren Teil
		int laenge = s.length();
		if (laenge % 2 == 0) {
			sVorne = s.substring(0, (laenge) / 2);
			sHinten = s.substring(laenge / 2, laenge);
		} else {
			sVorne = s.substring(0, (laenge - 1) / 2);
			sHinten = s.substring((laenge - 1) / 2 + 1, laenge);
		}
		System.out.println(sVorne);

		// Drehe Reihenfolge des hinteren Teils um
		char[] sHintenArray = sHinten.toCharArray();
		int l = sHintenArray.length;
		char[] sHintenArrayReversed = new char[l];
		for (int i = 0; i < l; i++) {
			sHintenArrayReversed[i] = sHintenArray[l - i - 1];
		}
		sHinten = String.valueOf(sHintenArrayReversed);
		System.out.println(sHinten);

		// Vergleiche vorderen Teil und hinteren Teil
		if (sVorne.equals(sHinten)) {
			palindrom = true;
		}
		return palindrom;
	}

}
