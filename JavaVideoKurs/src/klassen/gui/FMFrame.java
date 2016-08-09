package klassen.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import klassen.Fahrzeug;
import klassen.FahrzeugListe;
import klassen.LKW;
import klassen.Motorrad;
import klassen.PKW;

public class FMFrame extends JFrame
{
	private JLabel lblHeader;
	private JTable table;
	private JScrollPane scrollTable;
	private JProgressBar progBar;
	private JButton btnInfo;
	private JButton btnAdd;
	private JLabel lblHersteller, lblLeistung, lblPreis, lblTyp;
	private JTextField fldHersteller;
	private JSpinner spinLeistung, spinPreis;
	private JComboBox boxTyp;
	private JPanel pnlAdd;
	private JPanel pnlLeft;
	private JButton btnLoad;
	private FahrzeugListe<Fahrzeug> model; //model for the table (view)

	public FMFrame(FahrzeugListe<Fahrzeug> model) //model(s) is (are) passed into the constructor
	{
		this.model = model; //set the passed table model as model for this instance
		setTitle("Fahrzeug Manager"); //set window bar title
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //Set frame to stay open when clicking on 'x' -> will be handled differently

		//execute methods
		createWidgets(); //create widgets -> simply make them exist in the frame as objects
		setupInteractions(); //adds listeners to the widgets 
		addWidgets(); //put widgets on the content pane (content inside a frame)

		pack(); //automatically size window to match the space needed for its components (no exact size must be specified)
		setLocationRelativeTo(null); //put window in the center of the monitor screen (main monitor)
		setVisible(true); //makes frame window visible	
		
		WindowListener winListener = new WindowAdapter() //A WindowListener Object is assigned to an anonymous class that extends WindowAdapter (class)
				//Class is only available inside the constructor and cannot be instantiated
		{
			@Override
			public void windowClosing(WindowEvent e) //Overrides the method that is called when window is closed
			{
				//Shows a option window (Yes/No) -> Program ends if 'Yes' is selected
				int answer = JOptionPane.showConfirmDialog(FMFrame.this, "Wollen Sie wirklich beeden?", "Beenden?", JOptionPane.YES_NO_OPTION);

				if (answer == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				} 

			}
		};

		addWindowListener(winListener); //add listener to frame -> must be assigned in the constructor because there are no instances from it
		
		
		//-------------------------old implementation of MyWindowListener-------------------------------
		//		MyInfoListener als lokale Klasse

		//		class MyWindowListener extends WindowAdapter{
		//			
		//			@Override
		//			public void windowClosing (WindowEvent e){
		//				System.out.println("Wollen sie wirklich beenden?");
		//				System.exit(0);
		//			}
		//		}

		//WindowListener winListener = new MyWindowListener();
		//addWindowListener(new MyWindowListener());
		//-----------------------------------------------------------------------------------------------
		
	}

	private void setupInteractions() //add listeners to the widgets 
	{
		btnAdd.addActionListener(new AddFahrzeugAction());
		fldHersteller.addCaretListener(new HerstellerListener());
		btnLoad.addActionListener(new LadeBestandAction());
		btnInfo.addActionListener(new InfoAction());
	}

	private void addWidgets() //add widgets to content pane
	{
		//set layout for different areas of the content pane
		getContentPane().setLayout(new BorderLayout(5, 5)); //set border layout with a 5 pixel gap between the components
		getContentPane().add(BorderLayout.NORTH, lblHeader); //put a header at the top
		getContentPane().add(BorderLayout.SOUTH, progBar); //put a progress bar at the bottom
		getContentPane().add(BorderLayout.CENTER, scrollTable); //put a scroll table in the center
		getContentPane().add(BorderLayout.WEST, pnlLeft); //put a panel at the left side
		
		//------------------old stuff-----------------
		//getContentPane().add(BorderLayout.btnInfo);
		//getContentPane().add(pnlAdd);
		//---------------------------------------------
		
		
		//add widgets to the JPanel pnlAdd
		pnlAdd.add(lblHersteller);
		pnlAdd.add(fldHersteller);

		pnlAdd.add(lblLeistung);
		pnlAdd.add(spinLeistung);

		pnlAdd.add(lblPreis);
		pnlAdd.add(spinPreis);

		pnlAdd.add(lblTyp);
		pnlAdd.add(boxTyp);

		pnlAdd.add(Box.createHorizontalGlue());
		pnlAdd.add(btnAdd);

		pnlAdd.setMaximumSize(pnlAdd.getPreferredSize());
		pnlAdd.setAlignmentX(LEFT_ALIGNMENT);

		//put above JPanel into the panel on the left side
		pnlLeft.add(pnlAdd); 
		pnlLeft.add(Box.createVerticalGlue()); //insert a vertical glue area
		pnlLeft.add(btnLoad);
		pnlLeft.add(btnInfo);

		pnlLeft.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0)); //create an offset the the left content pane edge
	}

	// create widgets (definition only - does not add them to any layout)
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void createWidgets()
	{
		//create header label
		lblHeader = new JLabel("Fahrzeug Manager");
		
		//--------------------------------------------
		//lblHeader.setBounds(0, 0, 500, 40); //not needed since we use pack() to let Widget choose its own size
		//----------------------------------------------
		
		lblHeader.setFont(lblHeader.getFont().deriveFont(Font.BOLD + Font.ITALIC, 30));
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setOpaque(true);
		lblHeader.setBackground(Color.BLACK);
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);

		//create progress bar
		progBar = new JProgressBar(0, 100);
		progBar.setPreferredSize(new Dimension(0, 30));
		
		//--------------------------------------------
		//progBar.setBounds(0, 445, 485, 20); //not needed since we use pack() to let Widget choose its own size
		//--------------------------------------------

		//create table
		table = new JTable(model); //create a new JTable with the data model 'model' (which is a FahrzeugListe <Fahrzeug> object)
		table.setAutoCreateRowSorter(true); //enables sorting

		scrollTable = new JScrollPane(table); //set 'table' model to the JScrollPane (JScrollPane displays a table)
		
		//--------------------------------------------
		//scrollTable.setBounds(170, 50, 310, 390); //not needed since we use pack() to let Widget choose its own size
		//--------------------------------------------
		
		//create button
		btnInfo = new JButton("Information...");
		btnInfo.setAlignmentX(LEFT_ALIGNMENT);
		
		//--------------------------------------------
		//btnInfo.setBounds(5, 415, 100, 25); //not needed since we use pack() to let Widget choose its own size
		//--------------------------------------------

		//create button
		btnLoad = new JButton("Bestand laden");

		//create a new JPanel with unlimited lines and two columns (used for the left content pane area)
		pnlAdd = new JPanel();
		pnlAdd.setLayout(new GridLayout(0, 2));
		
		//--------------------------------------------
		//pnlAdd.setBounds(0, 50, 200, 300); //not needed since we use pack() to let Widget choose its own size
		//--------------------------------------------
		
		//create labels
		lblHersteller = new JLabel("Hersteller");
		lblLeistung = new JLabel("Leistung");
		lblPreis = new JLabel("Preis");
		lblTyp = new JLabel("Typ");

		//--------------------------------------------
		//		lblHersteller.setBounds(10, 0, 100, 25);
		//		lblLeistung.setBounds(10, 30, 100, 25);
		//		lblPreis.setBounds(10, 60, 100, 25);
		//		lblTyp.setBounds(10, 90, 100, 25);
		//not needed since we use pack() to let Widget choose its own size
		//--------------------------------------------

		//create text field, spinner and combo box
		fldHersteller = new JTextField();
		spinLeistung = new JSpinner(new SpinnerNumberModel(100, 5, 1000, 10));
		spinPreis = new JSpinner(new SpinnerNumberModel(5000, 500, 100000, 100));
		boxTyp = new JComboBox(new Object[] { "PKW", "LKW", "Motorrad" });

		//--------------------------------------------
		//		fldHersteller.setBounds(70, 0, 90, 25);
		//		spinLeistung.setBounds(70, 30, 90, 25);
		//		spinPreis.setBounds(70, 60, 90, 25);
		//		boxTyp.setBounds(70, 90, 90, 20);
		//not needed since we use pack() to let Widget choose its own size
		//--------------------------------------------

		//create button
		btnAdd = new JButton("Hinzufügen");
		btnAdd.setEnabled(false); //make it unavailable
		
		//--------------------------------------------
		//btnAdd.setBounds(70,120,90,25); //not needed since we use pack() to let Widget choose its own size
		//--------------------------------------------
		
		//create JPanel for the left area (two column JPanel will eventually be inserted into it)
		pnlLeft = new JPanel();
		pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.PAGE_AXIS));
	}
	
	//create an ActionListener method (creates and adds new 'Fahrzeug' to FahrzeugListe 'model')
	private class AddFahrzeugAction implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) //method is invoked by action (usually click)
		{
			//get values from widgets
			String hersteller = fldHersteller.getText();
			int leistung = (int) spinLeistung.getValue();
			int preis = (int) spinPreis.getValue();
			String typ = boxTyp.getSelectedItem().toString();
			Fahrzeug f = null;
			
			//use values to create a Fahrzeug object (type depends on the user selection)
			if (typ.equals("PKW"))
			{
				f = new PKW(leistung, hersteller, preis, 4);
			}
			if (typ.equals("LKW"))
			{
				f = new LKW(leistung, hersteller, preis);
			}
			if (typ.equals("Motorrad"))
			{
				f = new Motorrad(leistung, hersteller, preis);
			}
			
			//add the Fahrzeug object to the 'model' list
			model.add(f);
		}
	}
	
	//create a CaretListener method (make button available, if there is valid content inside a text field widget)
	private class HerstellerListener implements CaretListener
	{

		@Override
		public void caretUpdate(CaretEvent e) //method is invoked when caret position is updated (changed)
		{
			JTextField fld = (JTextField) e.getSource(); //defines the text field the listener is added to for this method
			String text = fld.getText(); //gets the text field content
			btnAdd.setEnabled(!text.trim().isEmpty()); //activates the button if content is not empty	
		}

	}

	//create an ActionListener method (displays a new dialogue window with content information)
	private class InfoAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			//create an output string message
			String msg = new String();
			msg += "Es befinden sich " + model.getElementCount() + " Fahrzeuge im Bestand.";
			msg += "\n";
			msg += "Gesamt-Wert des Bestands: " + model.berechneEinnahmen() + " €";

			//--------------------------------------------
			//			InfoPopup popup = new InfoPopup(FMFrame.this, msg);
			//			popup.setLocationRelativeTo(FMFrame.this); //in der Mitte des FMFrame zentrieren
			//			popup.setVisible(true);
			//--------------------------------------------

			//calls the dialogue window that displays the created message inside a declared component
			JOptionPane.showMessageDialog(FMFrame.this, msg, "Bestands-Informationen", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	//create an ActionListener method (simulates load process of adding 100 Fahrzeug objects to the scrollpane and displaying the status in the progress bar 
	private class LadeBestandAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			progBar.setStringPainted(true); //progress bar paints the progress
			
			new Thread() //create new anonymous class (extends Thread) -> must be started: new Thread(){ ...code... }.start();
			{
				@Override
				public void run()
				{
					for (int i = 1; i <= 100; i++)
					{
						//Daten lesen...
						try
						{
							Thread.sleep((long) (Math.random() * 100));
						}
						catch (InterruptedException ex)
						{
							ex.printStackTrace();
						}
						final int iNow = i; //anonymous classes (here: new Runnable()) can only access final local variables (which the i from the loop is not)
						SwingUtilities.invokeLater(new Runnable()
						{
							@Override
							public void run()
							{
								//add new PKW object to the model and change the value of the progress bar
								model.add(new PKW(iNow, "Test-Daten", iNow, 4));
								progBar.setString("Lade Bestand... " + iNow + " %");
								progBar.setValue(iNow);
							}
						});
					}
					SwingUtilities.invokeLater(new Runnable()
					{
						@Override
						public void run()
						{
							progBar.setValue(0);
							progBar.setStringPainted(false);
						}
					});
				}
			}.start(); //Thread is started
		}

	}

}
