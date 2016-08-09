package klassen;

public class ArrayHelp {

	public static int getElementCount(Object[] a) {
		// gib Anzahl der Elemente im Array an
		int elementCount = 0;
		for (Object item : a) {
			if (item != null) {
				elementCount++;
			}
		}
		return elementCount;
	}

	public static int getFreeSlotCount(Object[] a) {
		// gib Anzahl der freien Felder im Array an
		int emptyCount = a.length - getElementCount(a);
		return emptyCount;
	}

	public static int getNextFreeID(Object[] a){
		// gib die Adressse des freien Feldes mit der geringsten ID an
		for (int i = 0; i < a.length; i++){
			if (a[i] == null){
				return i;
				}
			}
		return -1;
}

}
