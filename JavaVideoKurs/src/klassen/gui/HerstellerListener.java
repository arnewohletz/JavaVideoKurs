package klassen.gui;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class HerstellerListener implements CaretListener
{
	private JButton btn;

	public HerstellerListener(JButton btn)
	{
		this.btn = btn;
	}

	@Override
	public void caretUpdate(CaretEvent e)
	{
		JTextField fld = (JTextField) e.getSource();
		String text = fld.getText();
		btn.setEnabled(!text.trim().isEmpty()); //aktiviere Button sofern Text vorhanden ist, ansonsten deaktivieren		
	}

}

//class is excluded