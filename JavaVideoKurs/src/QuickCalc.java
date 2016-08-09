
class QuickCalc
{

	private static int result;
	private static QuickCalc instance = new QuickCalc();

	QuickCalc(){
		
	}
	
	QuickCalc(int number)
	{
		result = number;
		System.out.println("WERT = " + result);
	}

	public QuickCalc add(int number)
	{
		System.out.println("+ " + number);
		result = result + number;
		System.out.println("WERT = " + result);
		return instance;
	}

	public QuickCalc minus(int number)
	{
		System.out.println("- " + number);
		result = result - number;
		System.out.println("WERT = " + result);
		return instance;
	}

	public QuickCalc invert()
	{
		System.out.println("<invertiere>");
		result = (-1)*result;
		System.out.println("WERT = " + result);
		return instance;
	}
	
	public QuickCalc add(QuickCalc number)
	{
		System.out.println("+ " + QuickCalc.result);
		result = result + QuickCalc.result;
		System.out.println("WERT = " + result);
		return instance;
	}

	public QuickCalc minus(QuickCalc number)
	{
		System.out.println("- " + QuickCalc.result);
		result = result - QuickCalc.result;
		System.out.println("WERT = " + result);
		return instance;
	}

	

}
