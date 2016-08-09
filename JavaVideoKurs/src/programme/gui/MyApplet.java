package programme.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JApplet;

public class MyApplet extends JApplet
{
	
	//Just added this because I want to test my Git Repo
	
	@Override
	public void paint(Graphics g)
	{
		g.fillRect(5, 5, 100, 100);
		//super.paint(g);
	}
	
	@Override
	public void init()
	{
		pack();
		System.out.println("init");
		//super.init();
	}
	
	private void pack(){
		Container c = getContentPane();
		Dimension prefSize = c.getLayout().preferredLayoutSize(c);
		setSize(prefSize.width, prefSize.height);
	}
	
	@Override
	public void start()
	{
		getParameter("");
		System.out.println("start");
		//super.start();
	}
	
	@Override
	public void stop()
	{
		System.out.println("stop");
		//super.stop();
	}
	
	@Override
	public void destroy()
	{
		System.out.println("destroy");
		//super.destroy();
	}

}
