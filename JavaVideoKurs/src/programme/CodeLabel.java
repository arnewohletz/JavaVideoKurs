package programme;

public class CodeLabel
{
	public static void main(String[] args)
	{

		meinCode:
		{

			System.out.println("Test 1");
			int i = 1;
			if (i == 2)
			{
				break meinCode;
			}
			System.out.println("Test 2");

		}
	
		meineSchleife: for(int j = 0; j < 10; j++){
			System.out.println("Test 1");
			int i = 1;
			if (i == 2)
			{
				continue meineSchleife;
			}
			System.out.println("Test 2");
		}
		
		meineGeschachtelteSchleife: for(int j = 0; j < 10; j++){
			meineZweiteSchleife: for(int k = 0; k < 10; k++){
				
				if (j == 5 && k == 5){
					break meineGeschachtelteSchleife; //innere und �u�ere for-Schleife wird beendet
				}
				else if (k>=5) {
					continue meineZweiteSchleife; //beendet alle Schleifendurchg�nge, bei denen k gr��er gleich 5 ist					
				}
				System.out.println("j = " + j + ", k = " + k);
			}
		}
	

	}
}
