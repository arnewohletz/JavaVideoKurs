package aufgaben_klassen;

public class Waffe {

	private int munition; // Anzahl an geladener Munition

	public void abfeuern() throws OutOfAmmoException{
		munition--;
		if(munition == 0){
			throw new OutOfAmmoException();
		}
	}

}
