package aufgaben_klassen;

import java.util.ArrayList;
import java.util.List;

public class Ueberweisung implements Runnable
{
	private static long idCounter = 0;
	private final long id;
	private final Konto absender;
	private final Konto empfaenger;
	private final int betrag;
	public static List<Konto> aktiveKonten = new ArrayList<Konto>();

	public Ueberweisung(Konto absender, Konto empfaenger, int betrag)
	{
		this.id = ++idCounter;
		this.absender = absender;
		this.empfaenger = empfaenger;
		this.betrag = betrag;
	}

	@Override
	public void run()
	{
		
		synchronized(aktiveKonten){
			
			while (aktiveKonten.contains(absender)||aktiveKonten.contains(empfaenger)){
				try
				{
					aktiveKonten.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
			aktiveKonten.add(absender);
			aktiveKonten.add(empfaenger);
		}
		
		synchronized(absender){
			
			synchronized (empfaenger)
			{

				System.out.println(Thread.currentThread() + " has the empfaenger lock");
				System.out.println("Starte �berweisung " + id + ": " + absender + " -> " + betrag + " � -> " + empfaenger);
				absender.setKtoStand(absender.getKtoStand() - betrag);
				empfaenger.setKtoStand(empfaenger.getKtoStand() + betrag);
				System.out.println("�berweisung " + id + " durchgef�hrt:" + absender + ", " + empfaenger);
				
				synchronized(aktiveKonten){
					aktiveKonten.remove(absender);
					aktiveKonten.remove(empfaenger);
					aktiveKonten.notifyAll();
				}

			}

		}
	}

}
