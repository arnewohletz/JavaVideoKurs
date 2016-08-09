package aufgaben_klassen;

public class Spielstein {
	private final SpielsteinFarbe farbe;

	public Spielstein(SpielsteinFarbe farbe) {
		this.farbe = farbe;
	}

	public SpielsteinFarbe getFarbe() {
		return farbe;
	}
}