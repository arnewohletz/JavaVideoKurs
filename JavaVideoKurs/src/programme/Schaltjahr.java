package programme;

public class Schaltjahr
{
	public static void main(String[] args)
	{
		String ausgabe;
		boolean schaltjahr;
		int jahr = 1600;

		schaltjahr = true;
		if (schaltjahr = jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0))
		{
			schaltjahr = true;
		}
		else
		{
			schaltjahr = false;
		}

		ausgabe = schaltjahr == true ? " ist ein Schaltjahr" : " ist kein Schaltjahr";
		System.out.println(jahr + ausgabe);

	}
}
