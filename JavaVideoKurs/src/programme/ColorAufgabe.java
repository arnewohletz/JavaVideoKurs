package programme;

import java.awt.Color;

public class ColorAufgabe {

	public static void main(String[] args) {
		
		Color yellow = new Color(0,255,255);
		System.out.println("<" + yellow.getRed() + ">-<" + yellow.getGreen() + ">-<" + yellow.getBlue());
		
		yellow = yellow.darker();
		System.out.println("<" + yellow.getRed() + ">-<" + yellow.getGreen() + ">-<" + yellow.getBlue());
		
	}
	
}
