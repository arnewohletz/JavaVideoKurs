package klassen;

public class OuterClass
{
	int a;
	static int b;

	class InnerClass
	{
		{
			System.out.println(a);
		}
	}

	static class StaticInnerClass
	{
		{
			System.out.println(b);
		}	
	}

	public static void main(String[] args)
	{
		OuterClass outer = new OuterClass();
		outer.new InnerClass();
		new StaticInnerClass();
	}
}
