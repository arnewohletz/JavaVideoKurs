package klassen;

import interfaces.Verkaeuflich;

public class WarenBestand {

	public static Verkaeuflich[] waren = new Verkaeuflich[100];
	private static int counter = 0;

	public static void hinzufuegen(Verkaeuflich v) {
		if (counter < waren.length) {
			waren[counter++] = v;
			System.out.println("Der Preis ist " + v.getPreis());
		}
	}

	public static int getAnzahlWaren() {
		return counter;
	}

	public static int berechneGesamtEinnahmen() {
		int total = 0;
		for (Verkaeuflich v : waren) {
			if (v == null) {
				break;
			}
			total += v.getPreis();
		}
		return total;
	}

}
