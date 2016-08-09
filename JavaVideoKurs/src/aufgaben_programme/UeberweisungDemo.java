package aufgaben_programme;

import aufgaben_klassen.Konto;
import aufgaben_klassen.Ueberweisung;

public class UeberweisungDemo
{
	
	public static void main(String[] args)
	{
		
		Konto k1 = new Konto(1, 1000);
		Konto k2 = new Konto(2, 2000);
		Konto k3 = new Konto(3, 3000);
		Konto k4 = new Konto(4, 4000);
		
		Ueberweisung u1 = new Ueberweisung(k1, k2, 100);
		Ueberweisung u2 = new Ueberweisung(k2, k1, 100);
		Ueberweisung u3 = new Ueberweisung(k3, k1, 100);
		Ueberweisung u4 = new Ueberweisung(k3, k4, 100);

		new Thread(u1).start();
		new Thread(u2).start();
		new Thread(u3).start();
		new Thread(u4).start();
		
	}

}
