package programme;

public class Initialize
{

	private static int x;
	private static int y;

	public static void main(String[] args)
	{

		Initialize objectA = new Initialize(0, 0);

		initializeXY(objectA);
		System.out.println("x=" + getX(objectA) + ", y=" + getY(objectA));
	}

	private static void initializeXY(Initialize objectA)
	{
		objectA = new Initialize(5, 8);
	}

	public static int getX(Initialize objectA)
	{
		x = objectA.x;
		return x;
	}
	
	public static int getY(Initialize objectA){
		
		y = objectA.y;
		return y;
	}

	public Initialize(int x, int y)
	{
	}

}
