package klassen.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindowListener extends WindowAdapter{

	@Override
	public void windowClosing (WindowEvent e){
		//TODO
		System.out.println("Wollen sie wirklich beenden?");
		System.exit(0);
	}

}

//class is excluded