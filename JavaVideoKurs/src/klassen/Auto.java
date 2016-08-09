package klassen;

public class Auto {

	public static final int DEFAULT_TUNEWERT = 25;

	{
		leistung = 50; /*
						 * ich kann bereits im Initialiesierungsblock eine
						 * Zuweisung machen. Wird unten die Instanzvariable int
						 * leistung = 100 initialisiert, so wird trotzdem der
						 * Wert im Initialisierungsblock (hier 50) zugewiesen
						 */
	}

	public static int erstellteAutos = 0; // Klassen-Variable

	static {
		System.out.println("Die Auto-Klasse wurde initialisiert");
	}

	// Instanz-Variablen (Klassenweit g�ltige Variablen)
	private int leistung; // PS
	private final String hersteller;

	/*
	 * Instanz-Variablen existieren nur 1 x pro Objekt Klassenvariablen
	 * existieren nur 1 x pro Programm (nicht 1 x pro Klasse) Klassenvariablen
	 * werden z.B. f�r globale Einstellungen verwendet
	 */

	{
		// nicht-statischer Initialisierungsblock (Codeblock im Klassenrummpf)
		// wird normalerweise für komplexe Berechnungen und Überprüfungen bei
		// der Erstellung einer Instanz

		/*
		 * leistung = 100; hersteller = "BMW";
		 */
	}

	// Getter
	public int getLeistung() {

		return leistung;
	}

	public String getHersteller() {
		return hersteller; // Methode wird nach return verlassen
	}

	// Setter
	private void setLeistung(int neueLeistung) // nur innerhalb der Klasse durch
												// Konstruktor ver�nderbar
												// (private)
	{
		boolean positiv = neueLeistung > 0;
		if (positiv) { // kurzfassung f�r positiv == true
			leistung = neueLeistung;
		} else {
			System.out.println("Ung�ltiger Wert f�r die Leistung - Programm wird beendet");
			System.exit(-1); // Programm wird beendet (Index = -1, f�r Konsole)
		}
	}

	/*
	 * private void setHersteller(String hersteller) //nur innerhalb der Klasse
	 * durch Konstruktor ver�nderbar (private) { this.hersteller = hersteller; }
	 */

	// Instanz-Methoden (Interaktion mit Objekten)
	// <Rückgabe-Datentyp> <Name> ({<Parameterliste>}) {<Methodenrumpf>}
	public void tunen(int tuneWert) {
		boolean positiv = tuneWert > 0;
		if (positiv) { // kurzfassung f�r positiv == true
			this.leistung += tuneWert;
		} else {
			System.out.println("Ung�ltiger Wert f�r die Leistung - Programm wird beendet");
			System.exit(-1); // Programm wird beendet (Index = -1, f�r Konsole)
		}
		return; // springt an dieser Stelle aus Methode raus, ohne einen Wert
				// zur�ckzugeben, da void
	}

	public void tunen() {
		tunen(DEFAULT_TUNEWERT);
	}

	// Konstrukoren

	/*
	 * default Kontruktor Auto()-> wird automatisch in jeder Klasse erstellt,
	 * auch wenn nicht deklariert Wird der Default-Konstruktor manuell erstellt,
	 * ersetzt es den bereits vorhandenen Default-Konstruktor Dieser hei�t dann
	 * aber nicht mehr Default-Konstruktor Der Default Kontruktor besitzt einen
	 * leeren Rumpf
	 */

	// <Klassennamen><({Parameterliste})> <{Rumpf (Logik)}>
	public Auto(int dieLeistung, String hersteller) {
		this.hersteller = hersteller;
		// Leistung = dieLeistung;
		setLeistung(dieLeistung); // weise Instanzvariable meinen
									// Konstruktor-Wert zu
		// Hersteller = derHersteller;
		// setHersteller(derHersteller);
		// Konstruktoren k�nnen ebenfalls auf Setter und Getter Methoden
		// zugreifen
		erstellteAutos = erstellteAutos + 1;
		System.out.println("Es wurde soeben das " + erstellteAutos + ". Auto erstellt");

	}

	public Auto(String hersteller) {
		this(100, hersteller);
	}

	/*
	 * Instanz-Initialisierung 1. - (kommt sp�ter) 2. Durchsucht Klasse
	 * zeilenweise nach Instanzvariablen -> legt diese an, wei�t aber noch
	 * keinen Wert zu int leistung; String hersteller; 3. F�hrt Zuweisungen
	 * zeilenweise aus int leistung = 100; oder int leistung = 0; (bei int
	 * leistung;) int hersteller = "BMW" oder String hersteller = null (bei
	 * String hersteller;) F�hrt Initialisierungsbl�cke aus 4. F�hrt
	 * Konstruktorrumpf durch
	 */

	/*
	 * Design-Tips 1. Instanzvariablen, die f�r alle Objekte dieser Klasse
	 * gelten sollen, nicht im Konstruktor sondern in der Klasse zuweisen 2.
	 * Auch wenn Default-Werte ben�tigt werden sollten Variablen trotzdem
	 * explizit deklariert werden
	 * 
	 */

	/*
	 * Access Modifier (definieren Sichtbarkeit f�r andere Klassen) package
	 * private ... nur verf�gbar f�r alle Klassen im gleichen Package (wird
	 * verwendet, sofern kein anderer angeben ist) protected ... (derzeit) wie
	 * package private (sp�ter mehr) public ... verf�gbar im gesamten Projekt,
	 * auch von Klassen in anderen Packages private ... nur in dieser Klasse
	 * verf�gbar
	 * 
	 * 1. Alle Instanz-Variablen m�ssen private gemacht werden 2. Alle anderen
	 * Elemente in der Regel public
	 * 
	 */

	/*
	 * statische Methode (auch Klassenmethode) kann nur auf andere als statisch
	 * deklarierte Funktionen zugreifen Sofern auf Methoden oder Variablen
	 * welche nicht als static deklariert sind zugegriffen werden soll, muss
	 * dies über eine Objekt passieren -> hier wird ein Objekt in die
	 * Klassenmethode übergeben (es könnte auch eines in der Klasse erzeugt
	 * werden
	 */
	public static void printInfos(Auto auto) {

		System.out.println("Die Leistung ist " + auto.leistung);
		System.out.println("Der Hersteller ist " + auto.hersteller);
	}
	/*
	 * statische Methoden verwendet man für objektunabhängige Berechnungen,
	 * Dinge, die unabhängig vom Objekt stets gleich ablaufen z.B. mathematische
	 * Berechnungen (es wird schlicht kein Objekt dafür gebraucht) Dieser Code
	 * kann in irgendeine Klasse als statische Methode geschrieben werden ohne,
	 * dass hierfür extra eine neue Klasse geschrieben werden muss
	 * 
	 * nicht OK: statisch -> nicht-statisch OK: statisch -> statisch OK:
	 * nicht-statisch -> nicht-statisch OK: nicht statisch -> statisch
	 * 
	 */

}
