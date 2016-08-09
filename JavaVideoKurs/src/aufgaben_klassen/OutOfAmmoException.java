package aufgaben_klassen;

public class OutOfAmmoException extends Exception{

	public OutOfAmmoException() {
		super();
	}

	public OutOfAmmoException(String msg) {
		super(msg);
	}

	public OutOfAmmoException(Throwable t) {
		super(t);
	}

	public OutOfAmmoException(String msg, Throwable t) {
		super(msg, t);
	}

}
