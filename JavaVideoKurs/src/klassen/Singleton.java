package klassen;

public class Singleton
{
	private static int number;

	//versteckter Konstruktor
	private Singleton(int inputNumber)
	{
		number = inputNumber;
	}

	/*
	 * erzeuge interne (private), finale Variable, welche die Instanz h�lt
	 * bei Erzeugung einer neuen Instanz im Program �ber getInstance() wird
	 * stets die Instanz 'instance' zur�ckgegeben
	 */
	private static final Singleton instance = new Singleton(number);

	/*
	 * �ffentliche Schnittstelle f�r die Applikation, um mit der Instanz zu
	 * arbeiten
	 */

	public static Singleton getInstance(int inputNumber)
	{
		number = inputNumber;
		return instance;
	}

	/*
	 * ...hier folgt das eigentliche Objekt-Design, d.h Variablen, Methoden etc.
	 */

	public static int getNumber()
	{
		return number;
	}

}
