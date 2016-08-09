package aufgaben_programme;

import aufgaben_klassen.Buecher;
import aufgaben_klassen.Filme;
import aufgaben_klassen.Videospiele;

public class OnlineShopProgramm {
	
	public static void main(String[] args) {
		
		Object[] medien = {
		new Buecher("Alice im Wunderland", 1, 20, "Lewis Carroll", 120),
		new Buecher("Es", 2, 15, "Stephen King", 1100),
		new Filme("Casino Royale", 3, 10, "Martin Campbell", 128),
		new Filme("Guilty of Romance", 4, 15, "Sion Sono", 117),
		new Videospiele("Dark Project", 5, 5, "PC", "Stealth-Adventure"),
		new Videospiele("GTAV", 6, 30, "PS4", "Open-World-Action")
		};
		
		for (Object o : medien){
			System.out.println(o);
		}
		
//		b1.printInfo();
//		b2.printInfo();
//		f1.printInfo();
//		f2.printInfo();
//		v1.printInfo();
//		v2.printInfo();
//		
//		b1.getPremiumContent();
//		b2.getPremiumContent();
		
	}

}
