package aufgaben_klassen;

public class UeberweisungA3 implements Runnable
{
	private static long idCounter = 0;
	private final long id;
	private final Konto absender;
	private final Konto empfaenger;
	private final int betrag;

	public static Object lock = new Object();

	public UeberweisungA3(Konto absender, Konto empfaenger, int betrag)
	{
		this.id = ++idCounter;
		this.absender = absender;
		this.empfaenger = empfaenger;
		this.betrag = betrag;
	}

	@Override
	public void run()
	{
		System.out.println("Starte Überweisung " + id + "...");
		synchronized (lock)
		{
			absender.setKtoStand(absender.getKtoStand() - betrag);
			empfaenger.setKtoStand(empfaenger.getKtoStand() + betrag);
		}
		System.out.println("Überweisung " + id + " durchgeführt.");
	}
}
