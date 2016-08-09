package programme;

public class VarArgs
{

	static int addiere(int ersteZahl, int zweiteZahl, int... weitereZahlen)
	{ //weitereZahlen referenziert ein int Array variabler Größe
		int ergebnis = ersteZahl + zweiteZahl;

		for (int z : weitereZahlen)
		{
			ergebnis += z;
		}
		return ergebnis;
	}

	public static void main(String[] args)
	{
		System.out.println(addiere(5, 6, 7, 8, 9));
	}
	
	//Regeln
	// 1. nur ein VarArg pro Methode erlaubt
	// 2. VarArg muss am Ende angegeben werden

}
