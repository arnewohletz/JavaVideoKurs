package programme;

import java.lang.Integer;

public class SummeMitSchleife
{

	public static void main(String[] args)
	{
		//		int zahl = 4;
		//		long summe = SummeMitSchleife.berechneSumme(zahl);
		int zahl2 = 12;
		int quersumme = SummeMitSchleife.berechneQuersumme(zahl2);

		System.out.println("Die Quersumme von " + zahl2 + " ist " + quersumme);
		//		System.out.println("Die Summe von " + zahl + " ist " + summe);
	}

	static long berechneSumme(int zahl)
	{
		int summe = 0;
		while (zahl > 0)
		{
			summe += zahl;
			System.out.println(zahl);
			zahl--;
		}
		return summe;
	}

	static int berechneQuersumme(int zahl)
	{
		int quersumme = 0;
		Integer integerZahl = new Integer(zahl); //create an Integer object containing the integer 'zahl'
		String stringZahl = integerZahl.toString(); //convert the Integer object to a String object
		char[] digits = stringZahl.toCharArray(); //convert the String object to a char array

		for (int i = 0; i < digits.length; i++)
		{
			int digit = Integer.parseInt(String.valueOf(digits[i])); //take char array value at specific index, convert it to a String, then to an Integer
			quersumme += digit;
		}
		return quersumme;
	}

	static int berechneQuersummeEleganter(int zahl)
	{

		String s = zahl + "";
		int quersumme = 0;

		for (char c : s.toCharArray())
		{
			int z = Integer.parseInt(c + "");
			quersumme += z;
		}

		return quersumme;
	}
}
