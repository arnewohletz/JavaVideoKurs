package programme;

public class BedingteAnweisungen
{

	public static void main(String[] args)
	{
		int i = 3;
		int j = 24;

		if (i > 0)
		{
			if (j == 25)
			{
				System.out.println("i ist positiv und j ist 25!");
			}
			else
			{
				System.out.println("i ist positiv und j ist nicht 25!");
			}
		}
		else if (i == 0)
		{
			System.out.print(("i ist null!"));

		}
		else
		{
			System.out.println("i ist negativ!");
		}

	}

}
