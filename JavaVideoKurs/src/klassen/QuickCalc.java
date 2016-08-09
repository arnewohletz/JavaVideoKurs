package klassen;

public class QuickCalc
{

	private static int result;
	private static QuickCalc instance = new QuickCalc();

	QuickCalc(){
		
	}
	
	public QuickCalc(int number)
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

/*How to run several methods in one command:
 * new QuickCalc(10).add(3).minus(3).invert().add(1).minus(7).invert().add(13);
 * 
 * 1) Return object of the method must be another instance:
 * 		1. Create a private instance of the class as an instance variable
 * 		2. Create an instance of the class & apply first method returning an private instance object
 * 		3. The returned object is applied another method, which also returns an object
 *
 * 2) Combine the result of another object (calculation) into the calculation of another
 * 		1. Create methods, that do the same actions, but an instance as input (not an Integer)
 * 		2. Take instance variable 'result' as the input
 * 
 * */	

}
