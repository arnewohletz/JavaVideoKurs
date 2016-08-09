package aufgaben_klassen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import klassen.Fahrzeug;
import klassen.FahrzeugListe;

public class FMFrame_GridLayout extends JFrame
{

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{
				try
				{
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				FMFrame_GridLayout frame = new FMFrame_GridLayout(new FahrzeugListe<Fahrzeug>(500));
				frame.setVisible(true);
			}

		});

	}

	private JLabel lblTitle, lblHersteller, lblLeistung, lblPreis, lblTyp;
	private JTextField fldHersteller;
	private JSpinner fldLeistung, fldPreis;
	private JComboBox<Fahrzeug> boxTyp;
	private JButton btnAdd, btnInfo;
	private JTable tblFahrzeuge;
	private JProgressBar barStatus;
	private FahrzeugListe<Fahrzeug> model;
	private JScrollPane scrollTable;

	public FMFrame_GridLayout(FahrzeugListe<Fahrzeug> model)
	{
		this.model = model;
		setTitle("Fahrzeug Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		createWidgets();
		addWidgets();

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void createWidgets()
	{

		lblTitle = new JLabel("Fahrzeug Manager");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(lblTitle.getFont().deriveFont(Font.BOLD | Font.ITALIC, 18));
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setBackground(Color.BLACK);
		lblTitle.setOpaque(true);

		lblHersteller = new JLabel("Hersteller");
		lblLeistung = new JLabel("Leistung");
		lblPreis = new JLabel("Preis");
		lblTyp = new JLabel("Typ");

		fldHersteller = new JTextField();

		fldLeistung = new JSpinner(new SpinnerNumberModel(100, 10, 1000, 10));
		fldPreis = new JSpinner(new SpinnerNumberModel(5000, 500, 50000, 100));

		boxTyp = new JComboBox(new Object[] { "PKW", "LKW", "Motorrad" });

		tblFahrzeuge = new JTable(model);
		tblFahrzeuge.setAutoCreateRowSorter(true);
		scrollTable = new JScrollPane(tblFahrzeuge);
		scrollTable.setPreferredSize(new Dimension(600, 400));

		btnAdd = new JButton("Hinzufügen");
		btnInfo = new JButton("Information...");

		barStatus = new JProgressBar(0, 100);
		barStatus.setPreferredSize(new Dimension(0, 30));
	}

	private void addWidgets()
	{
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 3;
		c.gridheight = 1;
		c.ipady = 10;
		c.ipadx = 10;
		c.weightx = 0.1;
		c.weighty = 0.1;
		c.anchor = GridBagConstraints.NORTH;
		c.fill = GridBagConstraints.HORIZONTAL;
		getContentPane().add(lblTitle, c);

		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.insets = new Insets(10, 10, 5, 5);
		c.anchor = GridBagConstraints.CENTER;
		getContentPane().add(lblHersteller, c);

		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		getContentPane().add(fldHersteller, c);

		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 6;
		c.weightx = 1.0;
		c.weighty = 1.0;
		//c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.BOTH;
		getContentPane().add(scrollTable, c);

		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.weightx = 0.1;
		c.weighty = 0.1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.CENTER;
		getContentPane().add(lblLeistung, c);

		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.EAST;
		getContentPane().add(fldLeistung, c);

		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.CENTER;
		getContentPane().add(lblPreis, c);

		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.EAST;
		getContentPane().add(fldPreis, c);

		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.CENTER;
		getContentPane().add(lblTyp, c);

		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.EAST;
		getContentPane().add(boxTyp, c);

		c.gridx = 1;
		c.gridy = 5;
		c.gridwidth = 1;
		getContentPane().add(btnAdd, c);

		c.gridx = 0;
		c.gridy = 6;
		c.gridwidth = 2;
		c.fill = GridBagConstraints.CENTER;
		c.anchor = GridBagConstraints.SOUTHWEST;
		getContentPane().add(btnInfo, c);

		c.gridx = 0;
		c.gridy = 7;
		c.gridwidth = 3;
		c.weighty = 0.1;
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.SOUTH;
		getContentPane().add(barStatus, c);
	}

}
