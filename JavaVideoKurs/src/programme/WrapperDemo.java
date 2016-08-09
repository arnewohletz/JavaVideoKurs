package programme;

import klassen.Liste;

public class WrapperDemo {

	public static void main(String[] args) {

		// Integer, Character, Byte, Short, Long, Double, Float, Boolean

		Integer integer = new Integer("100");
		int i = integer.intValue();

		Liste<Integer> liste = new Liste<Integer>(100);
		liste.add(25);
		i = liste.get(0);

		Double d1 = new Double(1.4);
		Double d2 = new Double(2.4);
		Double d3 = d1 + d2;

		Integer i1 = 50;
		Integer i2 = 50;
		
		System.out.println(i1 == i2);
		
		
		//BigInteger, BigDecimal
		
		for (double d = 0; d <= 1.0; d += 0.1){
			System.out.println(d);
		}
	}

}
