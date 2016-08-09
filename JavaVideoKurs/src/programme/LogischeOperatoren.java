package programme;

import klassen.Auto;

public class LogischeOperatoren
{
	public static void main(String[] args)
	{
		// ! (nicht) -> boolsche Negation; unärer Operator (gilt nur für ein Operanden)
		boolean b = false;
		System.out.println(!b);

		// & (und) -> binärer Operator (zwei Operanden nötig)
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

		// ACHTUNG: Klammerung nötig (nicht bei nur und-Ausdrücken)
		
		
		// Short circuit evaluation
		// && und ||  -> andere Schreibweise für & und | (liefert das gleiche Ergebnis)
		
		int i = 10;
		int j = 15;
		
		if (i == 10 || j == 15){
			// Abbruch bereits nach i == 50, da dieser Ausruck 'true' und damit die if-Bedingung erfüllt ist
		}
		
		if (i == 5 && j == 15){
			//Abbruch bereits nach i == 5, da dieser Ausdruck 'false und damit die if-Bedingung nicht erfüllt ist
			
		}
		
		//hier wird nach dem Überprüfen des ersten Ausdrucks bereits abgebrochen, sofern dieser false ist
		// wird verwendet, um nach einer gültigen Klasse zu prüfen ohne auf ein null-Objekt zu referenzieren
		if (audi != null && Auto.erstellteAutos == 2 & (audi.getLeistung() < 100 | audi.getLeistung() < bmw.getLeistung())){
			audi.tunen();
		}
		
		// es sollten immer die short circuit versionen verwendet werden (schneller, sicherer)
		// es sei denn man benötigt explizit die normalen
		
		
	}
}
