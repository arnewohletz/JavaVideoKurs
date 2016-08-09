package klassen;

public class SingletonAllein
{

	private SingletonAllein()
	{
		
	}

	private static SingletonAllein singleton = new SingletonAllein();

	public static SingletonAllein getInstance()
	{
		return singleton;
	}
}
