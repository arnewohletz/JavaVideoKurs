package aufgaben_klassen;

public class Konto
{

	private final int ktoNr;
	private int ktoStand;
	private boolean busy;

	public void setBusy(){
		this.busy = true;
	}
	
	public void unsetBusy(){
		this.busy = false;
	}
	
	public boolean getBusy(){
		return busy;
	}
	
	public Konto(int ktoNr, int ktoStand)
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
