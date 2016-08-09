package programme; //muss als erstes im Code angegeben werden

import klassen.Auto;

public class AutoProgram
{
	/*main Methode (static, also eine Klassen-Methode oder statische Methode) 
	 * -> keine Interaktion mit Objekten dieser Klasse, sondern eine Methode, 
	 * die sich in einer Klasse befindet (Methoden m�ssen stets in einer Klasse sein*/
	static String bmw = "BMW";
	
	public static void main(String[] args) {
		
		/* hier wird auf den Konstruktor der Auto.class zugegriffen, daher muss diese Datei (Auto.java) 
		zuerst kompiliert werden*/
		
		System.out.println("Das Program is gestartet...");
		
		Auto bmw;
		Auto audi;
		
		bmw = new Auto(-150, AutoProgram.bmw);
		audi = new Auto(100, "Audi");
		
		int i = Auto.erstellteAutos; //Zugriff auf Klassen-Variable
		
		//Punktnotation
		
		//<Objektname>.<Instanzvariable/Instanz-Methode>
		bmw.tunen(25);
		//bmw.setHersteller("Mercedes");
		
		//Zugriff auf eine Klassenmethode
		//<Klassenname>.<Klassenmethode>
		Auto.printInfos(bmw);  //hier muss konkret
		Auto.printInfos(audi);
		
		System.out.println(bmw.getLeistung());
		System.out.println(audi.getLeistung());
		System.out.println(bmw.getHersteller());
		
	}
	
}
