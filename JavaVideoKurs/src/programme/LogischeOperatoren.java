package programme;

import klassen.Auto;

public class LogischeOperatoren
{
	public static void main(String[] args)
	{
		// ! (nicht) -> boolsche Negation; un�rer Operator (gilt nur f�r ein Operanden)
		boolean b = false;
		System.out.println(!b);

		// & (und) -> bin�rer Operator (zwei Operanden n�tig)
		boolean b2 = true;
		System.out.println(b & b2);

		// | (oder) -> true, wenn mindestens einer der beiden Operanden true sind
		System.out.println(b | b2);

		// ^ (exklusives oder) -> true, wenn genau einer der Operanden true, der andere false ist
		System.out.println(b ^ b2);
		
	
		

		Auto bmw = new Auto(200, "BMW");
		//Auto audi = new Auto(120, "Audi");
		Auto audi = null;
		
		if (Auto.erstellteAutos == 2)
		{

			if (audi.getLeistung() < 100)
			{
				audi.tunen();
			}
			else if (audi.getLeistung() < bmw.getLeistung())
			{
				audi.tunen();
			}
		}

		//einfacher:

		if (Auto.erstellteAutos == 2)
		{

			if (audi.getLeistung() < 100 | audi.getLeistung() < bmw.getLeistung())
			{
				audi.tunen();
			}
		}

		//noch einfacher:

//		if (Auto.erstellteAutos == 2 & (audi.getLeistung() < 100 | audi.getLeistung() < bmw.getLeistung()))
//		{
//			audi.tunen();
//		}

		// ACHTUNG: Klammerung n�tig (nicht bei nur und-Ausdr�cken)
		
		
		// Short circuit evaluation
		// && und ||  -> andere Schreibweise f�r & und | (liefert das gleiche Ergebnis)
		
		int i = 10;
		int j = 15;
		
		if (i == 10 || j == 15){
			// Abbruch bereits nach i == 50, da dieser Ausruck 'true' und damit die if-Bedingung erf�llt ist
		}
		
		if (i == 5 && j == 15){
			//Abbruch bereits nach i == 5, da dieser Ausdruck 'false und damit die if-Bedingung nicht erf�llt ist
			
		}
		
		//hier wird nach dem �berpr�fen des ersten Ausdrucks bereits abgebrochen, sofern dieser false ist
		// wird verwendet, um nach einer g�ltigen Klasse zu pr�fen ohne auf ein null-Objekt zu referenzieren
		if (audi != null && Auto.erstellteAutos == 2 & (audi.getLeistung() < 100 | audi.getLeistung() < bmw.getLeistung())){
			audi.tunen();
		}
		
		// es sollten immer die short circuit versionen verwendet werden (schneller, sicherer)
		// es sei denn man ben�tigt explizit die normalen
		
		
	}
}
