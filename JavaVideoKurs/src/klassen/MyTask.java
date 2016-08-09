package klassen;

import java.util.Random;

public class MyTask implements Runnable
{

	private boolean alive;
	//DecimalFormat format = new DecimalFormat("###.###");

	@Override
	public void run()
	{
		alive = true;
		long start = System.currentTimeMillis();

		int bestMove = Integer.MIN_VALUE;
		Random random = new Random();
		for (int i = 1; i <= 100; i++)
		{
			for (int j = 1; j < 2000; j++)
			{
				for (int k = 0; k < 2000; k++)
				{
					synchronized (this)
					{
						if (!alive)
						{
							System.out.println("Stopping!");
							return;
						}
					}
					int move = random.nextInt();
					if (move > bestMove)
					{
						bestMove = move;
					}
				}
			}
			System.out.println("Thinking... " + i + "%");

		}

		long stop = System.currentTimeMillis();
		long time = stop - start;
		System.out.println(time);
		System.out.println(Thread.currentThread().getName() + " FINISHED AFTER " + time / 1000f + " seconds");
	}

	public synchronized void cancel()
	{
		alive = false;
	}
	
}
