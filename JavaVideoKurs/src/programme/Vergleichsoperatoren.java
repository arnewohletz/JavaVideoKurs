package programme;

import klassen.Auto;

public class Vergleichsoperatoren
{

	public static void main(String[] args)
	{
		
		/*
		 * 
		 * <
		 * <=
		 * >
		 * >=
		 * ==
		 * !=
		 * 
		 */
		
		double x = 6;
		long y = 3;
		
		System.out.println("Der minimale Double Wert ist " + Double.MIN_VALUE);
		System.out.println("Der maximale Double Wert ist " + Double.MAX_VALUE);
		
		boolean b = x < y;
		System.out.println(b);
		
		boolean b2 = true == false;
		System.out.println(b2);
		
		boolean b3 = "Hallo" == "Ciao";
		System.out.println(b3);
		
		// Prüfung auf Identität (weisen zwei Variable auf das gleiche Objekt)
		Auto a1 = new Auto(100, "BMW");
		Auto a2 = new Auto(100, "BMW");
		System.out.println(a1 == a2);
		
		
		
		
	}

}
