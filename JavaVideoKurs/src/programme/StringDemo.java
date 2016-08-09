package programme;

import java.util.regex.Pattern;

public class StringDemo {

	public static void main(String[] args) {

		// String hersteller = new String("Audi");
		// String hersteller2 = new String("Audi");

		String hersteller = "Audi";
		String hersteller2 = "Audi";

		hersteller = "Also";

		System.out.println(hersteller);

		String s = "Test";
		s = s.replace("s", "x");

		String regEx = "^[0-9][1-9]*,[0-9]{2}$"; 
		//eine Zahl von 0-9 
		//gefolgt von einer beliebigen Anzahl von Ziffern von 0-9
		//gefolgt von einem Komma
		//gefolgt von zwei Ziffern von 0-9
		System.out.println(Pattern.matches(regEx, "12,90"));
		
		System.out.println("Hallo\tCiao\nEnde");

	}

}
