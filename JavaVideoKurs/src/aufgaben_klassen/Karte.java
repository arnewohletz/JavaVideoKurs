package aufgaben_klassen;

import java.awt.Color;

public class Karte implements Cloneable {

	private int id; // einmalige ID der Karte innerhalb des Kartendecks
	private static int idCount = 0; // ID-Counter für das Verteilen von ID's.
	private int zahl; // Die Zahl der Karte (zB 7,8,9,10)
	private Color farbe; // Die Farbe der Karte (zB grün, rot)

	public Karte(int zahl, Color farbe) {
		this.id = ++idCount;
		this.zahl = zahl;
		this.farbe = farbe;
	}
	
	public void setZahl(int z){
		this.zahl += z;
	}
	
	public void setFarbe (Color c){
		this.farbe = c;
	}
	
	@Override
	public String toString(){
		String color = this.farbe.toString();
		return "Farbe: " + color + "\nZahl: "+ zahl;
	}

	@Override
	public Karte clone() {

		Karte klon = null;
		try {
			klon = (Karte) super.clone();
			klon.id = ++id;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return klon;
	}

	public int hashCode() {
		int farbCode;

		if (farbe.equals(Color.GREEN)) {
			farbCode = 10;
		} else if (farbe.equals(Color.BLUE)) {
			farbCode = 20;
		} else if (farbe.equals(Color.RED)) {
			farbCode = 30;
		} else if (farbe.equals(Color.YELLOW)) {
			farbCode = 40;
		} else {
			farbCode = 50;
		}
		return farbCode + zahl;
	}

	@Override
	public boolean equals(Object o) {
		// Prüfe ob übergebtes Objekt vom Typ Karte ist
		if (!(o instanceof Karte)) {
			return false;
		}
		// Caste Objekt vom Typ Objekt auf den Typ Karte
		Karte k = (Karte) o;

		// Prüfe, ob die Farbe gleich sind
		if (this.farbe.equals(k.farbe)) {
			return true;
		}
		// Prüfe, ob die Zahl gleich ist
		if (this.zahl == k.zahl) {
			return true;
		}
		// Prüfe, ob Farbe und Zahl beide gleich sind
		if (this.farbe == k.farbe) {
			if (this.zahl == k.zahl) {
				if (this.id != k.id) {
					return true;
				}
			}
		}
		return false;
	}

}
