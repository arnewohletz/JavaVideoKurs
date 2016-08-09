package aufgaben_klassen;

import aufgaben_interfaces.UserType;

public class Videospiele extends Medien implements UserType{
	
	private String Plattform;
	private String Genre;
	
	public void printInfo(){
		super.printMediaInfo();
		System.out.println(", Plattform: " + Plattform + ", Genre: " + Genre);
	}
	
	public void getPremiumContent(){
		if(PREMIUMUSER){
			WebServiceFeatures.dateiHerunterladen("www.google.de");
		} else {
			System.out.println("Bitte kaufen Sie einen Premium Account");
		}
	}

	public Videospiele(String Bezeichnung, int ArtNr, int Preis, String Plattform, String Genre){
		setBezeichnung(Bezeichnung);
		setArtNr(ArtNr);
		setPreis(Preis);
		this.Plattform = Plattform;
		this.Genre = Genre;
	}

	@Override
	public String toString(){
		return super.toString() + ", Plattform: " + Plattform + ", Genre: " + Genre;
	}
}
