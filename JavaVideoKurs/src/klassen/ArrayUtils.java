package klassen;

public class ArrayUtils {

	// Utils bezeichnet häufig eine Hilfsklasse für Arrays bereitstellt

	public static <X> Liste<X> arrayToList(X[] array) {
		Liste<X> liste = new Liste<X>(array.length);
		for (X x : array) {
			liste.add(x);
		}
		return liste;
	}

	public static int getRemainingSlots(Liste<?> liste) {
		return liste.getCapacity() - liste.getElementCount();
	}
}
