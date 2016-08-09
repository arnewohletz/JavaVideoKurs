package klassen;

public class ProzentRechnung {

	private static int richtwert;
	private static float prozent;
	private static float wert;

	public float wertZuProzent(int wert) {

		prozent = (float) wert / richtwert * 100;
		return prozent;
	}

	public float prozentZuWert(float prozent) {
		wert = (float) prozent/100 * richtwert;
		return wert;
	}
	
	public ProzentRechnung(int zahl) {
		richtwert = zahl;
	}

}
