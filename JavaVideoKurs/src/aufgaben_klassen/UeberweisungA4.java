package aufgaben_klassen;

public class UeberweisungA4 implements Runnable
{
	private static long idCounter = 0;
	private final long id;
	private final Konto absender;
	private final Konto empfaenger;
	private final int betrag;

	public UeberweisungA4(Konto absender, Konto empfaenger, int betrag)
	{
		this.id = ++idCounter;
		this.absender = absender;
		this.empfaenger = empfaenger;
		this.betrag = betrag;
	}

	@Override
	public void run()
	{
		synchronized (absender)
		{
			System.out.println(Thread.currentThread() + " has the absender lock");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			synchronized (empfaenger)
			{
				System.out.println(Thread.currentThread() + " has the empfaenger lock");
				System.out.println("Starte Überweisung " + id + ": " + absender + " -> " + betrag + " € -> " + empfaenger);
				absender.setKtoStand(absender.getKtoStand() - betrag);
				empfaenger.setKtoStand(empfaenger.getKtoStand() + betrag);
				System.out.println("Überweisung " + id + " durchgeführt:" + absender + ", " + empfaenger);
				
//				try
//				{
//					Thread.sleep(2000);
//				}
//				catch (InterruptedException e)
//				{
//					e.printStackTrace();
//				}
			}
		}
	}
}
