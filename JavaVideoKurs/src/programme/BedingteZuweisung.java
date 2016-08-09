package programme;

public class BedingteZuweisung
{

	public static void main(String[] args)
	{
		
		String s;
		int j = 10;
		if (j % 2 == 0){
			s = "Zahl gerade";
		}
		else{
			s = "Zahl ist ungerade";
		}
		
		//Konditionaloperator
		s = j % 2 == 0 ? "Zahl gerade" : "Zahl ungerade"; // das gleiche wie oben
		
		s = j % 2 == 0 ? j == 0 ? "Zahl gerade (null)": "Zahl gerade": "Zahl ungerade";
		
		
		int a = 0;
		if (a == 0) {
			System.out.println(":)");
		}
		else{
			System.out.println(":(");
		}
		
		System.out.println(a== 0 ? ":)":":(");
	}

}
