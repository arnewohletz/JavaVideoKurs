package aufgaben_klassen;

public class KontoA4
{

	private final int ktoNr;
	private int ktoStand;

	public KontoA4(int ktoNr, int ktoStand)
	{
		this.ktoNr = ktoNr;
		setKtoStand(ktoStand);
	}

	public void setKtoStand(int ktoStand)
	{
		connectToServer();

		this.ktoStand = ktoStand;

	}

	public int getKtoStand()
	{
		connectToServer();
		return ktoStand;
	}

	private void connectToServer()
	{
		try
		{
			// sleep()-Aufruf simuliert eine Verbindungsherstellung: 
			Thread.sleep((long) (Math.random() * 500));
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public String toString()
	{
		return "Konto " + ktoNr + " (" + ktoStand + " €)";
	}

}
