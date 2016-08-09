
class QuickCalcProgram
{

	public static void main (String[] args){
		
		QuickCalc q1 = new QuickCalc(-9).add(3).minus(1).invert().add(3);
		System.out.println("done");
		QuickCalc q2 = new QuickCalc(5).invert().add(11).minus(5);
		System.out.println("done");
		
		new QuickCalc(5).add(q1).minus(q2).add(q2.invert());
		
		//new QuickCalc(10).add(3).minus(3).invert().add(1).minus(7).invert().add(13);
		
	}
}
