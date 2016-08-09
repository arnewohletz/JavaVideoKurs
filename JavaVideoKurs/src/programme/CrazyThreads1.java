package programme;

public class CrazyThreads1 implements Runnable
{

	boolean alive;
	long i;

	@Override
	public void run()
	{
		System.out.println("Thread starts...");
		i = 0;
		alive = true;

		while (true) //Langfassung für while (alive = true) { i++; }
		{
			if (alive)
			{
				i++;
			}
			else
			{
				break;
			}
		}
		System.out.println("Thread ends...");
	}

	public static void main(String[] args)
	{
		CrazyThreads1 c = new CrazyThreads1(); //ein zweiter Thread wird erzeugt (zusätzlich zu main())
		new Thread(c).start(); //run() Methode der Instanz-Methode wird in einem neuen Thread ausgeführt

		
		// Die Methode prüft den aktuellen Wert von i im zweiten Thread. Übersteigt dies 1 Milliarde, so wird der Thread beendet
		while (Thread.activeCount() > 1) //mindestens zwei gerade aktive Threads
		{

			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			long iNow = c.i;
			System.out.println(iNow);
			if (iNow >= LIMIT)
			{
				c.alive = false;
				System.out.println("THREAD STOPPED! (alive = " + c.alive + ")");
			}

		}
		System.out.println("Program exits...");
		/*Das Programm endet nie (die if-Schleife wird nie verlassen)
		 * Auch wenn alive = false ist und i bereits 1 Milliarde überschritten hat läuft das Programm ewig weiter
		 */
	}

	private static final long LIMIT = 1000000000L;

}
