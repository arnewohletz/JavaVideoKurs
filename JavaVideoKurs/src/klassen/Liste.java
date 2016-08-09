package klassen;

public class Liste<T> {

	private T[] array;
	private int nextFreeSlot = 0;

	public Liste(int capacity) {
		array = (T[]) new Object[capacity]; //Warnung OK
	}

	public void add(T o) {
		if (nextFreeSlot == array.length) {
			throw new IllegalStateException("Die Liste ist voll");
		}
		array[nextFreeSlot] = o;
		nextFreeSlot++;
	}

	public T get(int index) {
		return array[index];
	}

	public int getCapacity() {
		return array.length;
	}

	public int getElementCount() {
		return nextFreeSlot;
	}

}
