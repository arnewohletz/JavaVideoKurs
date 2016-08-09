package programme;

public class OperatorenDemo {

	public static void main(String[] args) {

		// Arithmetische Operatoren
		System.out.println(10 + 5 + "Konkanenation" + 5 + 5.5 + (7 + 3));

		System.out.println(-50 - -25);
		System.out.println(3 * 4);

		System.out.println(10 / 3); // nur ganze Zahl als Ergebnis
		System.out.println(10 / 3.0); // genaue Zahl als Ergebnis, da eine
										// Fließkommazahl in Rechnung

		System.out.println(11 % 5); // zeigt nur den Rest an

		// Inkrement (++) und Dekrement(--)

		int a = 5;

		// Postfix
		a++;
		System.out.println(a);

		a--;
		System.out.println(a);

		// Prefix
		++a;
		System.out.println(a);
		--a;
		System.out.println(a);

		int x = 10;
		int y = 10;
		System.out.println(x++); // wird nach Ende der Anweisung erhöht
		System.out.println(++y); // wird vor Ende der Anweisung erhöht
		
		//Achtung: z wird nicht erhöht
		int z = 5;
		z = z++; //hier muss z++; verwendet werden, z = z++; erhöht sich nicht da die Erhöhung 
		//nach der Zuweisung erfolgt
		System.out.println(z);
	}
}
