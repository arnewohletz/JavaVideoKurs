package aufgaben_programme;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class Test
{
		
	
	public static void main(String[] args)
	{
		
		LinkedList <BigInteger> list = new LinkedList<BigInteger>();
		
		BigInteger zahl1 = new BigInteger ("100");
		BigInteger zahl2 = new BigInteger ("200");
		BigInteger zahl3 = new BigInteger ("0");
		
		list.add(zahl1);
		list.add(zahl2);
		System.out.println("Letztes Element in der Liste ist " + list.getLast());
		
		//zahl3 = zahl1.add(zahl2);
		//zahl3 = zahl2.subtract(zahl1);
		zahl2.add(zahl2.subtract(zahl1));
		
		//zahl2 = zahl1.add(new BigInteger(zahl3 + ""));
		
		//System.out.println(zahl2);
		
//		Long l1 = new Long (1000);
//		
//		//BigInteger result = new BigInteger("");
//		
//		System.out.println(zahl1.longValue() + zahl2.longValue());
//		String l1String = l1.toString();
		
	}

}
