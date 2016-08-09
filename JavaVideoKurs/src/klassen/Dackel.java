package klassen;

import interfaces.Verkaeuflich;

public class Dackel extends Hund implements Verkaeuflich{
	
	private int preis; 
	
	@Override
	public int getPreis(){
		return preis;
	}
	
//	public Dackel(int preis){
//		this.preis = preis;
//	}
	
	public Dackel(int preis){
		super(preis);
		this.preis = preis;
	}

}
