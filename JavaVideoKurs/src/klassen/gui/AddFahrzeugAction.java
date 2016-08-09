package klassen.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFahrzeugAction implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//TODO
		System.out.println(Thread.currentThread().getName());
		System.out.println(e.getActionCommand() + " wurde geklickt");

	}
}

//class is excluded
