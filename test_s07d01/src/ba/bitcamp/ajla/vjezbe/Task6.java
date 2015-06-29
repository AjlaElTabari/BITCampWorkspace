package ba.bitcamp.ajla.vjezbe;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creates small GUI app that contains one JFrame and one JPanel.
 * Prints out coordinates of mouse position. Changes live.	
 * @author ajla.eltabari
 *
 */
public class Task6 extends JFrame {

	private static final long serialVersionUID = 5792316907266524167L;
	private JPanel panel = new MyPanel();
	private int x, y;
	
	public Task6() {
		setLayout(new BorderLayout());
		add(panel);
		
		panel.addMouseMotionListener(new MouseMotion());		
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setTitle("Task6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task6();
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 6747467664022745482L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
				g.drawString("X: " + x, 150, 140);
				g.drawString("Y: " + y, 220, 140);
		}
		
	}
	
	private class MouseMotion implements MouseMotionListener {
	
		@Override
		public void mouseDragged(MouseEvent arg0) {
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
		
	}
}
