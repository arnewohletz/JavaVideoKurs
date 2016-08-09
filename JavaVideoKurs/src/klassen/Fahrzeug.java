package klassen;

import interfaces.Verkaeuflich;

/**
 * Ein Fahrzeug kann ein {@link PKW}, {@link LKW} oder {@link Motorrad} sein. Fahrzeuge haben einen nicht veränderbaren Hersteller und lassen sich tunen
 * @author Arne Wohletz   
 * @version 1.0
 * @since 0.8
 * @see FahrzeugListe
 * 
 *  */

public abstract class Fahrzeug implements Verkaeuflich, Cloneable {

	public static final int DEFAULT_TUNEWERT = 25;

	{
		leistung = 50;
	}

	public static int erstellteFahrzeuge = 0;

	static {
		System.out.println("Die Auto-Klasse wurde initialisiert");
	}

	// Instanzvariablen
	int leistung;
	private String hersteller;
	private int preis;

	// Getter
	public int getLeistung() {

		return leistung;
	}

	public String getHersteller() {
		return hersteller;
	}

	public int getPreis() {
		return preis;
	}

	// Setter
	private void setLeistung(int neueLeistung) {
		boolean positiv = neueLeistung > 0;
		if (positiv) {
			leistung = neueLeistung;
		} else {
			System.out.println("Ungï¿½ltiger Wert fï¿½r die Leistung - Programm wird beendet");
			System.exit(-1);
		}
	}

	// Instanz-Methoden (Interaktion mit Objekten)

	public void setPreis(int preis) {

		this.preis = preis;
	}

	public void tunenMitEx(int tuneWert) {
		if (tuneWert <= 0) {
			throw new TunenException("Der Tunewert darf nicht negativ sein");
		} else {
			leistung += tuneWert;
		}
	}

	/**
	 * 
	 *Erhöht die Leistung des Fahrzeug um den angegebenen Wert (PS)
	 *@param tuneWert Der Wert, um das das Fahrzeug getuned werden soll
	 *@throws Diese Methode wirft keine Exception
	 */
	public void tunen(int tuneWert) {
		boolean positiv = tuneWert > 0;
		if (positiv) {
			this.leistung += tuneWert;
		} else {
			System.out.println("Ungï¿½ltiger Wert fï¿½r die Leistung - Programm wird beendet");
			System.exit(-1);
		}
		return;
	}

	public void tunen() {

		tunen(DEFAULT_TUNEWERT);

	}

	@Override
	public Fahrzeug clone() {
		Fahrzeug f = null;
		
		try {
			f = (Fahrzeug) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return f;
	}

	public abstract void crashTest();

	// Konstrukoren

	public Fahrzeug(int dieLeistung, String hersteller, int preis) {
		this.hersteller = hersteller;
		this.preis = preis;

		setLeistung(dieLeistung);

		erstellteFahrzeuge = erstellteFahrzeuge + 1;
		System.out.println("Es wurde soeben das " + erstellteFahrzeuge + ". Auto erstellt");

	}

	public Fahrzeug() {
	}

	public Fahrzeug(String hersteller) {
		this(100, hersteller, 0);
	}

	public static void printInfos(Fahrzeug f) {

		System.out.println("Die Leistung ist " + f.leistung);
		System.out.println("Der Hersteller ist " + f.hersteller);
	}

	@Override
	public String toString() {
		return "Die Leistung ist " + leistung + ", der Hersteller ist " + hersteller;
	}

}
