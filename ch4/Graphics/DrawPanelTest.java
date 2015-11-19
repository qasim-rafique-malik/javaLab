package javaLab.ch4.Graphics;

//importing library
import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawPanel panel = new DrawPanel();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		
		application.setSize(100,100);
		
		application.setVisible(true);
		

	}

}
