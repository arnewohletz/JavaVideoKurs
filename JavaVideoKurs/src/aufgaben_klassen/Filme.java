package aufgaben_klassen;

import aufgaben_interfaces.UserType;

public class Filme extends Medien implements UserType{

	private String Regisseur;
	private int Spieldauer;
	
	public void printInfo(){
		super.printMediaInfo();
		System.out.println(", Regisseur: " + Regisseur + ", Spieldauer: " + Spieldauer);
	}
	
	public void getPremiumContent(){
		if(PREMIUMUSER){
			WebServiceFeatures.videoAbspielen("www.google.de");
		} else {
			System.out.println("Bitte kaufen Sie einen Premium Account");
		}
	}

	public Filme(String Bezeichnung, int ArtNr, int Preis, String Author, int Spieldauer){
		setBezeichnung(Bezeichnung);
		setArtNr(ArtNr);
		setPreis(Preis);
		this.Regisseur = Author;
		this.Spieldauer = Spieldauer;
	}
	
	@Override
	public String toString(){
		return super.toString() + ", Regisseur: " + Regisseur + ", Spieldauer: " + Spieldauer;
	}
	
}
