package programme;

public class Array
{

	public static void main(String[] args)
	{
		
		int length = args.length;
		System.out.println(length);
		System.out.println(args[0]);
		
		for (int i = 0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
		int[] intArray = new int[3]; //leeres Array mit drei Fächer
		intArray[0] = 34;
		intArray[1] = 56;
		intArray[2] = 21;
		
		int[] intArray2 = new int[] {1, 4, 8, 19, 234};
		int[] intArray3 = {5, 4, 8, 19, 234};
		
		System.out.println(intArray2[0]);
		System.out.println(intArray3[0]);
		
		String[][] zweiDimArray = new String[2][5];
		zweiDimArray[0][0] = "Hans";
		zweiDimArray[0][1] = "Müller";
		zweiDimArray[0][2] = "555 333";
		zweiDimArray[1][0] = "Peter";
		zweiDimArray[1][1] = "Maier";
		zweiDimArray[1][2] = "777 812";
		
		//nicht rechteckiges Array
		String[][] zweiDimArray2 = new String[2][];
		zweiDimArray[0] = new String[19];
		zweiDimArray[1] = new String[4];
		
		int[][][] dreiDimArray;
		
	}
}
