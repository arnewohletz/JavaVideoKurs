package aufgaben_klassen;

public class Spiellogik {

	private Spieler spieler;
	private Anzeige anzeige;

	public void mausKlick() {
		try{
			spieler.waffeAbfeuern();
		}
		catch(OutOfAmmoException o){
			anzeige.zeigeAn(o.getMessage());
		}
		}

}
