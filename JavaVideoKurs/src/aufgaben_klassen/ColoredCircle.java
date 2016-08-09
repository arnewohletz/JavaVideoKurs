package aufgaben_klassen;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class ColoredCircle extends JPanel
{
	Point currentMousePosition;
	
	@Override
	public void paintComponent(Graphics g){
		
		currentMousePosition = getMousePosition();
		g.drawRect((int)currentMousePosition.getX()-20, (int)currentMousePosition.getY()-20, 40, 40);
		
	}

}
