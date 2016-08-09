package programme;

public class SynchedThreads1 implements Runnable
{

	volatile boolean alive;
	volatile long i;

	@Override
	public void run()
	{
		System.out.println("Thread starts...");
		i = 0;
		alive = true;

		while (true) //Langfassung für while (alive = true) { i++; }
		{
			synchronized (this)
			{ //muss hier rein, damit main-Thread alive wieder auf false setzen zu können
				if (alive)
				{
					i++;
				}
				else
				{
					break;
				}
			}
		}
		System.out.println("Thread ends...");
	}

	public static void main(String[] args)
	{
		SynchedThreads1 c = new SynchedThreads1(); //ein zweiter Thread wird erzeugt (zusätzlich zu main())
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
			
			long iNow;
			synchronized(c){
				iNow = c.i;
			}
			
			System.out.println(iNow);
			if (iNow >= LIMIT)
			{	
				synchronized(c){
				c.alive = false;
				}
				System.out.println("THREAD STOPPED! (alive = " + c.alive + ")");
			}

		}
		System.out.println("Program exits...");
		/*
		 * Das Programm endet nie (die if-Schleife wird nie verlassen) Auch wenn
		 * alive = false ist und i bereits 1 Milliarde überschritten hat läuft
		 * das Programm ewig weiter
		 */
	}

	private static final long LIMIT = 300000000L;

}
