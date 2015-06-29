package ba.bitcamp.ajla.vjezbe;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creates small GUI app that contains one JFrame and one JPanel
 * JPanel contains one label that tells us what mouse button was pressed.
 * @author ajla.eltabari
 *
 */
public class Task3 extends JFrame {

	private static final long serialVersionUID = -7909658659820618065L;
	private JPanel panel = new MyPanel();
	private int click;
	
	public Task3() {
		setLayout(new BorderLayout());
		add(panel);	
		
		setTitle("Task2");
		setSize(400, 300);
		panel.addMouseListener(new Mouse());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task3();
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 6747467664022745482L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			switch(click) {
			case 1:
				g.drawString("Left click", 170, 140);
				break;
			case 2:
				g.drawString("Middle click", 170, 140);
				break;	
			case 3:
				g.drawString("Right click", 170, 140);
				break;	
			}
		}
		
	}
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (e.getSource() == panel) {
				click = e.getButton();
				repaint();
			}			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
