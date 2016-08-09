package programme;

import klassen.Fahrzeug;
import klassen.PKW;

public class FahrzeugDemo
{
	
	public static void main(String[] args)
	{
		
		Fahrzeug f = new PKW(300,"BMW", 20000, 5);

		f.tunenMitEx(-80);

		System.out.println(f.getLeistung());
		
		PKW pkw = new PKW();
		pkw.tunen(79);
		System.out.println(pkw.getLeistung());
		
		System.out.println(PKW.DEFAULT_TUNEWERT); //befindet sich in der Superklasse, nicht in der Vater-Klasse
	}

}
