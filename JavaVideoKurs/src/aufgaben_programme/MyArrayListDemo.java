package aufgaben_programme;

import aufgaben_klassen.MyArrayList;

public class MyArrayListDemo {

	public static void main(String[] args) {

		MyArrayList<String> liste = new MyArrayList<String>();

		String s1 = new String("Hallo! ");
		String s2 = new String("Wer ");
		String s3 = new String("bist ");
		String s4 = new String("du ");
		String s5 = new String("denn?");
		
		// Teste size()
		System.out.println(liste.size());

		// Teste isEmpty()
		System.out.println("Die Liste ist leer? " + liste.isEmpty());

		// Teste add(String s)
		liste.add(s1);
		liste.add(s2);
		liste.add(s3);
		liste.add(s4);
		liste.add(s5);

		// Teste isEmpty()
		System.out.println("Die Liste ist leer? " + liste.isEmpty());

		// Teste get(int i)
		System.out.println(liste.get(0) + liste.get(1) + liste.get(2) + liste.get(3) + liste.get(4));

		// Teste size()
		System.out.println(liste.size());

		// Teste contains(String s)
		System.out.println(liste.contains("Hallo! "));
		System.out.println(liste.contains("Diesen String gibt es nicht"));
		System.out.println(liste.get(0));

		// Teste remove(String s)
		liste.remove("Hallo! ");
		System.out.println(liste.size());
		System.out.println(liste.get(0) + liste.get(1) + liste.get(2) + liste.get(3));
		System.out.println(liste.size());

		// Teste remove(int i)
		liste.remove(3);
		System.out.println(liste.get(0) + liste.get(1) + liste.get(2));
		System.out.println(liste.size());
		System.out.println(liste.get(2));

		// Test clear()
		liste.clear();
		System.out.println(liste.size());
		System.out.println(liste.isEmpty());
		System.out.println(liste.get(0) + liste.get(1) + liste.get(2));
		liste.add(s1);
		liste.add(s2);
		liste.add(s3);
		System.out.println(liste.get(0) + liste.get(1) + liste.get(2));
	}

}
