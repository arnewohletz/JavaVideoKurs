package aufgaben_programme;

import aufgaben_klassen.MailGueltig;

public class EMail {

	public static void main(String[] args) {
		
		String test = "info009";
		
		String mail1 = "iNFO@javavideokurs.de";
		String mail2 = "1337@pro.biz";
		String mail3 = "myEmail@gmail.com";
		String mail4 = "X@gmx.net";
		String mail5 = "@y.com";
		String mail6 = "ätt@nix.com";
		String mail7 = "iswearthisismyemailadress.net";
		String mail8 = "my_email@gmail.com";

		
		MailGueltig.mailGueltig(test);
		
		MailGueltig.mailGueltig(mail1);
		MailGueltig.mailGueltig(mail2);
		MailGueltig.mailGueltig(mail3);
		MailGueltig.mailGueltig(mail4);
		MailGueltig.mailGueltig(mail5);
		MailGueltig.mailGueltig(mail6);
		MailGueltig.mailGueltig(mail7);
		MailGueltig.mailGueltig(mail8);
		
	}

}
