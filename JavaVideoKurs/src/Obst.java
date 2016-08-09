
class Obst
{
	private String name;
	private int naehrwert;
	private int einkaufspreis;
	private int verkaufspreis;

	public void behandeln()
	{
		verkaufspreis = verkaufspreis * 2;
		naehrwert = naehrwert + 50;
	}

	private void setName(String nameObst)
	{
		name = nameObst;
	}

	private void setNaehrwert(int kcal)
	{
		naehrwert = kcal;
	}

	private void setEinkaufspreis(int einkauf)
	{
		einkaufspreis = einkauf;
		verkaufspreis = einkaufspreis * 2;
	}

	public int getVerkaufspreis()
	{
		return verkaufspreis;
	}

	public int getNaehrwert()
	{
		return naehrwert;
	}

	public int getEinkaufspreis()
	{
		return einkaufspreis;
	}

	public String getName()
	{
		return name;
	}

	Obst(String obstname, int kcal, int einkauf)
	{

		setName(obstname);
		setNaehrwert(kcal);
		setEinkaufspreis(einkauf);
		verkaufspreis = einkaufspreis * 2;

	}

}
