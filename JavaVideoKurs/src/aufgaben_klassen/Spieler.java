package aufgaben_klassen;

public class Spieler {

	private Waffe ausgeruesteteWaffe;
	private int munitionImGepaeck;

	public void waffeAbfeuern() throws OutOfAmmoException{
		try{ 
			ausgeruesteteWaffe.abfeuern();
		}
		catch(OutOfAmmoException o){
			String msg = munitionImGepaeck == 0 ? "Keine Munition mehr! Waffe wechseln!": "Keine Munition mehr! Nachladen!";
			throw new OutOfAmmoException(msg);
		}
	}
}
