package aufgaben_klassen;

public class MyArrayList<X> {

	private X[] array;
	private int count = 0; // speichert die Zahl der Elemente im Array
	private int index = 0; // speichert den Index eines ELements im Array

	@SuppressWarnings("unchecked")
	public MyArrayList() {
		this.array = (X[]) new Object[0];
	}

	public boolean contains(X e) {

		index = 0;
		for (X a : array) {
			if (!a.equals(e)) {
				index++;
			} else {
				System.out.println("Der String befindet sich an Position " + index);
				return true;
			}
		}
		return false;
	}

	public int containsAt(X e) {

		contains(e);
		return index;
	}

	public void add(X e) {

		if (array.length != 0 && array.length > count) {
			array[count] = e;
		} else {
			extendArray();
			array[count] = e;
		}
		count++;
	}

	public boolean remove(X e) {

		if (e.equals(null)) {
			throw new NullPointerException("Das gesuchte Objekt ist leer");
		}
		if (contains(e)) {
			int index = containsAt(e);
			System.out.println("Der String befindet sich an Position " + index);
			remove(index);
			return true;
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	public void remove(int i) {

		X[] reducedArray = (X[]) new Object[array.length - 1];

		if (i >= array.length || i < 0) {
			throw new IndexOutOfBoundsException("Der Index befindet sich außerhalb des Arrays");
		} else if (i == array.length - 1) {
			array[i] = null;

		} else {

			array[i] = null;
			while (i < array.length - 1) {
				array[i] = array[i + 1];
				i++;
			}
		}
		for (int j = 0; j < array.length - 1; j++) {
			reducedArray[j] = array[j];
		}
		array = reducedArray;
		count--;
	}

	public X get(int i) {
		if (i >= array.length || i < 0) {
			throw new IndexOutOfBoundsException("Der Index befindet sich außerhalb des Arrays");
		} else {
			return array[i];
		}

	}

	public void clear() {

		for (int i = 0; i < array.length; i++) {
			array[i] = null;
			count--;
		}
	}

	public boolean isEmpty() {

		if (count == 0) {
			return true;
		}

		return false;
	}

	public int size() {

		return count;
	}

	@SuppressWarnings("unchecked")
	private void extendArray() {

		X[] extendedArray = (X[]) new Object[array.length + 1];

		if (array.length != 0) {
			for (int i = 0; i < array.length; i++) {
				extendedArray[i] = array[i];
			}
		}
		array = extendedArray;
		extendedArray = null;
	}

}
