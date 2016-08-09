package programme;
import klassen.Singleton;
import klassen.SingletonAllein;

class SingletonProgram
{

	public static void main(String[] args)
	{
		Singleton first = Singleton.getInstance(1);	
		Singleton second = Singleton.getInstance(2);
		
		System.out.println(first.getNumber());
		System.out.println(second.getNumber());
		
		SingletonAllein third = SingletonAllein.getInstance();
		SingletonAllein fourth = SingletonAllein.getInstance();
		
		System.out.println(third);
		System.out.println(fourth);
		
		
	}

}
