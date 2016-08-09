class ObstProgram
{
	public static void main(String[] args)
	{
		Obst apfel = new Obst("apfel", 200, 5);
		apfel.behandeln();
		System.out.println(apfel.getNaehrwert());
		
		Obst banane = new Obst("banane", 350, 10);
		banane.behandeln();
		System.out.println(banane.getName());

		Gemuese gurke = new Gemuese("gurke", 200, 10);
		new Obst("melone", 500, 20).behandeln();
		
		System.out.println(new Obst("birne", 200, 10).getNaehrwert());

	}


}
