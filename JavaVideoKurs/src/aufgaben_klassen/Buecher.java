package aufgaben_klassen;

import aufgaben_interfaces.UserType;

public class Buecher extends Medien implements UserType{
	
	private String Author;
	private int Seiten;
	
	public void printInfo(){
		super.printMediaInfo();
		System.out.println(", Autor: " + Author + ", Seiten: " + Seiten);
	}
	
	public void getPremiumContent(){
		if(PREMIUMUSER){
			WebServiceFeatures.pdfAnzeigen("www.google.de");
		} else {
			System.out.println("Bitte kaufen Sie einen Premium Account");
		}
	}

	public Buecher(String Bezeichnung, int ArtNr, int Preis, String Author, int Seiten){
		setBezeichnung(Bezeichnung);
		setArtNr(ArtNr);
		setPreis(Preis);
		this.Author = Author;
		this.Seiten = Seiten;
	}
	
	@Override
	public String toString(){
		return super.toString() + ", Autor: " + Author + ", Seiten: " + Seiten;
	}
}
