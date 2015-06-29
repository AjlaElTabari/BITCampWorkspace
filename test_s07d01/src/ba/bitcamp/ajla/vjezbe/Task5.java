package ba.bitcamp.ajla.vjezbe;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Creates small GUI app that contains one JFrame and one JPanel
 * JPanel contains two lines that represent diagonals
 * Uses Graphics2D class to include anti aliasing and lines thickness.
 * Diagonals are appear only on mouseEnterd, and disappeared immediately on mouseExited
 * @author ajla.eltabari
 *
 */
public class Task5 extends JFrame {
	private static final long serialVersionUID = 1490006643134837592L;
	
	private JPanel panel = new MyPanel();
	private boolean show = false;
	
	public Task5() {
		setLayout(new BorderLayout());
		add(panel);		
		
		setTitle("Task2");
		setSize(400, 300);
		panel.setBackground(Color.WHITE);
		panel.addMouseListener(new Mouse());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task5();
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setStroke(new BasicStroke(10));
			
			if(show) {
				g2d.drawLine(0, 0, getWidth(), panel.getHeight());
				g2d.drawLine(0, panel.getHeight(), panel.getWidth(), 0);
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == panel) {
				panel.setForeground(Color.RED);
				show = true;
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == panel) {
				panel.setForeground(Color.WHITE);
				show = false;
			}
		}
		
	}
}
