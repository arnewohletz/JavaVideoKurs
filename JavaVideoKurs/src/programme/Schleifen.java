package programme;

import java.util.Random;

import klassen.Auto;

public class Schleifen
{

	public static void main(String[] args)
	{
		//for-Schleife
		int max = 10;
		for (int i = 1; i <= max; i++)
		{
			System.out.println(i + ". Schleifendurchlauf");
		}

		int[] potenzen = new int[20];
		for (int i = 1; i < potenzen.length; i++)
		{

			int zahl = (int) Math.pow(2, i);
			System.out.println(zahl);
			potenzen[i] = zahl;

		}

		int[][] zweiDimArray = new int[3][];
		zweiDimArray[0] = new int[12];
		zweiDimArray[1] = new int[8];
		zweiDimArray[2] = new int[65];

		for (int i = 0; i < zweiDimArray.length; i++)
		{
			for (int j = 0; j < zweiDimArray[i].length; j++)
			{
				zweiDimArray[i][j] = 5;
			}
		}

		//for-Each Schleife

		for (int i : potenzen)
		{
			System.out.println(i); //Schleife geht jeden Wert eines Arrays durch und speichert ihn in die angegebene Variable (hier: i)

		}

		//while-Schleife

		Random r = new Random();
		int zahl = r.nextInt(6) + 1; //liefert Zahl zwischen 0 und 5 (-1 < r < 6) 
		System.out.println("Zahl ist: " + zahl);
		while (zahl != 6)
		{
			zahl = r.nextInt(6) + 1; //liefert Zahl zwischen 0 und 5 (-1 < r < 6) -> DOPPELTER CODE, besser mit do-while Schleife
			System.out.println("Zahl ist: " + zahl);
		}

		//		while(){  //wird genutzt, sofern nicht bekannt ist, wie lange die Schleife ausgeführt werden soll
		// for( ; x !=6; ) entspricht der gleichen Logik wie while(zahl != 6), liest sich aber nicht so gut
		//			
		//		}

		//do-while Schleifen

		Random g = new Random();
		int zahl2;
		do
		{
			zahl2 = g.nextInt(6) + 1;
			System.out.println("Zahl ist: " + zahl2);
		} while (zahl != 6);

		//break

		int[] randomArray = new int[50];
		for (int i = 0; i < randomArray.length; i++)
		{
			randomArray[i] = r.nextInt();
		}

		for (int z : randomArray)
		{
			if (z % 2 == 1)
			{
				System.out.println("Ungerade Zahl: " + z);
				break; //for-Schleife wird abgebrochen
			}
		}

		//continue

		Auto[] autos = new Auto[10];
		for (int i = 0; i < autos.length; i++)
		{
			autos[i] = new Auto(80 + i * 15, "Test");
		}

		for (Auto a : autos)
		{
			if (a.getLeistung() > 100)
			{
				//komplexer Code
			}
			
			if(a.getLeistung() <= 100) {
				continue; //beendet den aktuellen Schleifendurchgang
			}
			// komplexer Code
		}
		
		//continue 
	}

}
