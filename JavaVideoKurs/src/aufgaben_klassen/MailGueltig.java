package aufgaben_klassen;

import java.util.regex.Pattern;

public class MailGueltig {
	
	public static boolean mailGueltig(String s){
		
		String regEx = "^[a-zA-Z0-9]{3,}@[a-zA-Z]{3,}?\\.(de|com|net|biz)$";
		
//		if (s.matches(regEx)){
//			System.out.println(s + " ist eine legale Mail-Adresse");
//			return true;
//		}else {
//			System.out.println(s + " ist keine legale Mail-Adresse");
//			return false;
//		}
		
		return Pattern.matches(regEx, s);
	}

}
