
public class Singleton
{
	private static int number;

	//versteckter Konstruktor
	private Singleton(int inputNumber)
	{
		number = inputNumber;
	}

	/*
	 * erzeuge interne (private), finale Variable, welche die Instanz hält
	 * bei Erzeugung einer neuen Instanz im Program über getInstance() wird
	 * stets die Instanz 'instance' zurückgegeben
	 */
	private static final Singleton instance = new Singleton(number);

	/*
	 * öffentliche Schnittstelle für die Applikation, um mit der Instanz zu
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
