package aufgaben_klassen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawCirclesFrame extends JFrame
{
	JFrame drawFrame;
	JPanel drawPanel;
	Point currentMousePosition;
	JButton button;

	public DrawCirclesFrame()
	{
		//setSize(1000, 1000);
		//setTitle("Drawing Circles");
		//setVisible(true);

		createWidgets();
		addWidgets();
	}

	public void createWidgets()
	{
		drawPanel = new JPanel();
		//drawPanel.setBackground(Color.GRAY);
		drawPanel.setPreferredSize(new Dimension(1000, 1000));
		button = new JButton("Press me!");
		button.setPreferredSize(new Dimension(100, 20));
	}

	public void addWidgets()
	{
		getContentPane().setLayout(new BorderLayout(5, 5));
		getContentPane().add(BorderLayout.CENTER, drawPanel);
		getContentPane().add(BorderLayout.SOUTH, button);
	}

	public void addListeners()
	{
		//drawPanel.addMouseMotionListener(new drawCircle());
		//button.addActionListener(new clickToDraw());
		
		//drawPanel.addMouseListener(new drawCircleAtClick());
		
		drawPanel.addMouseMotionListener(new addCanvas());
		//drawPanel.addActionListener(new addCanvas());
	}

	public class addCanvas extends JPanel implements MouseMotionListener, ActionListener
	{

		@Override
		public void paintComponent(Graphics g)
		{
			currentMousePosition = getMousePosition();
			super.paintComponent(g); //needed!!!
			this.setBackground(Color.WHITE);

			g.setColor(Color.RED);
			//g.drawOval((int) currentMousePosition.getX() - 20, (int) currentMousePosition.getX() - 20, 100, 100);
			//g.fillOval((int) currentMousePosition.getX() - 20, (int) currentMousePosition.getX() - 20, 100, 100);
			g.fillOval(50, 50, 100, 100);
		}

		@Override
		public void mouseDragged(MouseEvent e)
		{
			drawPanel.repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e)
		{
			drawPanel.repaint();
		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
			drawPanel.repaint();
		}

	}

	

	public class drawCircle implements MouseMotionListener
	{
		@Override
		public void mouseDragged(MouseEvent e)
		{
			drawPanel.repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e)
		{
			drawPanel.repaint();
		}
	}

	public class clickToDraw implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			drawPanel.repaint();
		}

	}

	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		DrawCirclesFrame frame = new DrawCirclesFrame();
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Drawing circles");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}
