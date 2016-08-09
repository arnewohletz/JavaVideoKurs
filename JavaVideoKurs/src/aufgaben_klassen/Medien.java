package aufgaben_klassen;

public abstract class Medien {
	
	private String bezeichnung;
	private int artNr;
	private int preis;
	private int premiumRequestLink;

	public void setBezeichnung(String Bezeichnung){
		this.bezeichnung = Bezeichnung;
	}
	
	public void setArtNr(int ArtNr){
		this.artNr = ArtNr;
	}
	
	public void setPreis(int Preis){
		this.preis = Preis;
	}
	
	public void printMediaInfo(){
		System.out.print("Bezeichnung: " + bezeichnung + ", Art.Nr.: " + artNr + 
				", Preis: " + preis);
	}
	
	@Override
	public String toString(){
		return "Bezeichnung: " + bezeichnung + ", Art.Nr.: " + artNr + 
				", Preis: " + preis;
	}
	
}
