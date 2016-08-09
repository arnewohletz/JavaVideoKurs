package aufgaben_klassen;

import java.math.BigInteger;
import java.util.LinkedList;

public class Summe implements Runnable
{
	private static long value;
	private static long count;
	private static int anzahlThreads;
	private static Object lock = new Object();
	private static int j;
	private static LinkedList<BigInteger> summe = new LinkedList<BigInteger>();
	private long startValue;
	private long endValue;
	private static long berechnungenJeThread;
	private String threadValue;
	private static BigInteger result;

	public static BigInteger berechneSumme(long zahl, int threads) throws IllegalArgumentException
	{
		if (zahl < 1 || threads < 1 || threads > zahl)
		{
			throw new IllegalArgumentException("Zahl oder Anzahl der Threads nicht OK");
		}

		j = 0;
		anzahlThreads = threads;
		value = zahl;
		count = value - anzahlThreads + 1;
		berechnungenJeThread = (long) value / anzahlThreads;
		Summe[] thread = new Summe[threads];
		BigInteger[] summeArray = new BigInteger[anzahlThreads];

		while (j < threads)
		{
			thread[j] = new Summe();
			thread[j].startValue = value;
			if (j == threads - 1)
			{
				thread[j].endValue = 1;
			}
			else
			{
				thread[j].endValue = value - berechnungenJeThread + 1;
				value = value - (zahl / threads);
			}
			new Thread(thread[j]).start();
			j++;
		}

		while (count != 1)
		{
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		switch (threads)
		{
			case 1:
				result = summe.get(0);
				break;
			case 2:
				result = summe.get(0).add(summe.get(1));
				break;
			default:
			{
				summeArray[0] = summe.get(0).add(summe.get(1));

				for (int i = 1; i < threads - 1; i++)
				{
					summeArray[i] = summeArray[i - 1].add(summe.get(i + 1));
					result = summeArray[i];
				}
			}
		}
		summe.clear();
		summeArray = null;
		return result;
	}

	@Override
	public void run()
	{
		threadValue = startValue + "";
		BigInteger threadValueBI = new BigInteger(threadValue);
		LinkedList<BigInteger> zwischensumme = new LinkedList<BigInteger>();
		zwischensumme.add(threadValueBI);
		Long k = new Long(0);

		for (long i = startValue; i > endValue; i--)
		{
			k++;
			zwischensumme.add(zwischensumme.getLast().add(threadValueBI.subtract(new BigInteger(k.toString()))));

			synchronized (lock)
			{
				count--;
			}
		}
		summe.add(zwischensumme.getLast());
	}
}