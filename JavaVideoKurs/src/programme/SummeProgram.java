package programme;

public class SummeProgram
{

	public static void main(String[] args)
	{
		String zahl = args[0];
		int z = Integer.parseInt(zahl);
		long ergebnis = berechneSumme(z);

		System.out.println("Die Summe von " + z + " ist: " + ergebnis);

	}

	static long berechneSumme(int zahl)
	{

		if (zahl == 1)
		{
			return 1; //beendet Methode
		}

		return zahl + berechneSumme(zahl - 1);
	}
}
