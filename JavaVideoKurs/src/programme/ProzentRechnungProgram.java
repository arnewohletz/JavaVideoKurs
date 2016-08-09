package programme;

import klassen.ProzentRechnung;

public class ProzentRechnungProgram {

	public static void main(String[] args) {

		ProzentRechnung pr = new ProzentRechnung(500);
		System.out.println(pr.wertZuProzent(1000));
		System.out.println(pr.wertZuProzent(23));
		System.out.println(pr.prozentZuWert(50));
		System.out.println(pr.prozentZuWert(1));

	}

}
