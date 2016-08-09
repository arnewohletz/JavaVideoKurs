package klassen;

public class PKW extends Fahrzeug
{

	{
		super.leistung = 100;
	}
	
	//private int leistung;
	private int anzahlTueren;
	
	public void setAnzahlTueren (int anzahlTueren) {
		this.anzahlTueren = anzahlTueren;
	}
	
	public int getAnzahlTueren() {
		return anzahlTueren;
	}
	
	@Override
	public void crashTest(){
		//TODO
	}
	
	public PKW(int leistung, String hersteller, int preis, int anzahlTueren) {

		super(leistung, hersteller, preis);
		setAnzahlTueren(anzahlTueren);
	} 
	
	public PKW(){
		super();
	}
	
	public String toString(){
		return super.toString() +", Anzahl der Türen ist " + anzahlTueren;
	}
	
	@Override
	public int hashCode(){
		return getLeistung() + new Integer (11*getAnzahlTueren()).hashCode() + getHersteller().hashCode(); 
	}
	
}
