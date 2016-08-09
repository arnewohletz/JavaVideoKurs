
class Kunde
{
	private static int aktuelleKundennummer = 1;
	public final int kundennummer;
	private String kundenname;

	public Kunde(String name)
	{
		kundenname = name;
		kundennummer = aktuelleKundennummer;
		aktuelleKundennummer = aktuelleKundennummer + 1;
		System.out.println("Der Kunde " + name + " wurde als Kunde Nr. " + kundennummer + " angelegt.");
	}
	
	public String getKundenname(){
		return kundenname;
	}

}


