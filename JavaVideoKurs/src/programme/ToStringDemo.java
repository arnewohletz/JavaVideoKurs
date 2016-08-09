package programme;

import klassen.Fahrzeug;
import klassen.PKW;

public class ToStringDemo {

	
	public static void main(String[] args) {
		
		Fahrzeug f = new PKW(200, "Mercedes", 30000, 3);
		//System.out.println(f);
		System.out.println(f.toString());
	}
}
 