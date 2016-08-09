package aufgaben_klassen;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class ServerConnectNewThread extends JFrame
{

	private JButton btnConnect;
	private JLabel status;

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

				ServerConnectNewThread frame = new ServerConnectNewThread();
				frame.setVisible(true);
			}

		});

	}

	public ServerConnectNewThread()
	{

		createWidgets();
		addListeners();
		addWidgets();

		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}

	private void createWidgets()
	{
		btnConnect = new JButton();
		btnConnect.setText("Connect");
		status = new JLabel("Not connected");

	}

	private void addListeners()
	{
		btnConnect.addActionListener(new ConnectToServer());
	}

	private void addWidgets()
	{
		getContentPane().setLayout(new BorderLayout(5, 5));
		getContentPane().add(BorderLayout.SOUTH, btnConnect);
		getContentPane().add(BorderLayout.NORTH, status);
	}

	public class ConnectToServer implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			String msg = "Bitte warten";
			status.setText(msg);
			long i = (long) (Math.random() * 10000);
			System.out.println(i);

			new Thread()
			{

				@Override
				public void run()
				{

					try
					{
						Thread.sleep(i);

						if (i <= 5000)
						{
							status.setText("Verbindung aufgebaut");
						}

						else
						{
							status.setText("verbindung konnte nicht hergestellt werden");
						}

					}
					catch (Exception e2)
					{
						e2.printStackTrace();
					}

				}

			}.start();

		}

	}

}
