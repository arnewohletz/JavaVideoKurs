package aufgaben_klassen;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class BadGUI extends JFrame
{
	public static void main(String[] args)
	{
		new BadGUI().setVisible(true);
	}

	private JLabel stoppuhr;
	private JButton start;
	private JButton stopButton;
	private Button buttonPausieren;

	public BadGUI()
	{
		setTitle("Bad GUI!");
		stoppuhr = new JLabel("00:00:00.000");
		buttonPausieren = new Button("Pause");
		start = new JButton("Start");
		stopButton = new JButton("STOP");
		stopButton.setSize(100, 50);
		stoppuhr.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel buttons = new JPanel(new FlowLayout());
		buttons.add(start);
		buttons.add(stopButton);
		buttons.add(buttonPausieren);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(BorderLayout.CENTER, stoppuhr);
		getContentPane().add(BorderLayout.PAGE_END, buttons);
		// TODO Actions für Buttons
		setSize(300, 100);
		//pack();
	}

}
