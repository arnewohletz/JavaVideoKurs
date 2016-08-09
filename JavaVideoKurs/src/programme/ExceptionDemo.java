package programme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		String pfad = "c:/windows/settings.xml";
		try{
			dateiAnlegen(pfad);
		}catch(Exception e){
			
		}
		

		try {
			Object o = null;
			o.toString();
		} catch (NullPointerException e) {
			System.out.println("NPE!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Fehler, aber ist nicht so schlimm");
		} finally {
			System.out.println("Finally!");
		}

	}

	static void checked() throws FileNotFoundException{
		FileReader f = new FileReader(new File("C:/xxx"));
		throw new FileNotFoundException();
	}
	
	static void dateiAnlegen(String Pfad) throws Exception{
		boolean dateiExistiert = true; //...
		if(dateiExistiert){
			throw new Exception ("Die Datei existiert bereits"); 
		}
		//Code, der die Datei hier anlegt hier ...
	}

}
