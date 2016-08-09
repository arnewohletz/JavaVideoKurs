package programme;

import java.awt.Color;
import java.awt.SystemColor;

import org.xml.sax.InputSource;

import klassen.Auto;

public class DatentypenDemo {

	public static void main(String[] args) {

		// primitive Datentypen

		int i = 25;
		long l = 100;
		short s = 10;
		byte b = 5;
		double d = 23 / 7;
		double d2 = 2.;
		float f = 0.3333344f;
		long l2 = 30000000000L;
		char c = 169;
		boolean bo = true;

		int i2 = Integer.MAX_VALUE;
		int i3 = Integer.MIN_VALUE;

		// System.out.print(c);
		System.out.print(i3 + " " + i2);

		// komplexe Datentypen

		// leiten sich aus Klassen ab -> es gibt noch zwei weitere Typen
		// (später)

		Auto a = new Auto("Audi");
		String st;
		Color mycolor = new Color(255,0,0);
		mycolor = SystemColor.CYAN;
		
		InputSource input = new InputSource();
		input.getCharacterStream();

	}

}
