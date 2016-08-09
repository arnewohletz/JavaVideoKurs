package klassen;

public class Retriever extends Hund {

	private int preis;

	@Override
	public int getPreis() {
		return preis;
	}

	public Retriever(int preis) {
		super(preis);
	}

}
