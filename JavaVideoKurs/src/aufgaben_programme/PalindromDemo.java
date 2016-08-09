package aufgaben_programme;

import aufgaben_klassen.Palindrom;

public class PalindromDemo {
	
	public static void main(String[] args) {
		
		String palindrom1 = "Die Liebe ist Sieger stets rege ist sie bei Leid";
		String palindrom2 = "Reittier";
		boolean ergebnis = Palindrom.istPalindrom(palindrom1);
		boolean ergebnis2 = Palindrom.istPalindrom(palindrom2);
		
		System.out.println(palindrom1 + "\nist ein Palindrom: " + ergebnis);
		System.out.println(palindrom2 + "\nist ein Palindrom: " + ergebnis2);
		
	}

}
