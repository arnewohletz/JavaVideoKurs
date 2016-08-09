package klassen;

public class Quersumme {
	
	public static void main(String[] args) {
		
		System.out.println("Die Quersumme von 23 ist " + berechneQuersumme(23));
		System.out.println("Die Quersumme von 56 ist " + berechneQuersumme(56));
		System.out.println("Die Quersumme von 21 ist " + berechneQuersumme(21));
		System.out.println("Die Quersumme von 67 ist " + berechneQuersumme(67));
		
	}
	
	public static int berechneQuersumme(int zahl){
		
		int zehner = zahl/10;
		int einer = zahl%10;
		
		int quersumme = zehner + einer;
		
		return quersumme;
		
	}

}
