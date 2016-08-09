package klassen;

public abstract class Hund {
	
	private static int erstellteHunde = 0;
	private int preis;
	
	public int getPreis(){
		return preis;
	}
	
	public Hund(int preis) {
		this.preis = preis;
		erstellteHunde = erstellteHunde + 1;
		System.out.println("Es wurde soeben der " + erstellteHunde + ". Hund erstellt");

	}
	

}
