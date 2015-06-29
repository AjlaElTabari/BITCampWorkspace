package ba.bitcamp.ajla.vjezbe;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Task7 extends JFrame {

	private static final long serialVersionUID = 793896467571116409L;
	private JPanel panel = new MyPanel();
	private int[] values = {10, 20, 30, 10, 50, 18, 2, 40};
	
	public Task7() {
		setLayout(new BorderLayout());
		add(panel);		
		
		setSize(500, 300);
		setLocationRelativeTo(null);
		setTitle("Task7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task7();
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 6747467664022745482L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int x = 10, y = 200;
			for(int i = 0; i < values.length; i++) {
				g.fillRect(x, y - values[i], 30, values[i]);
				x += 30;
			}
		}
		
	}
	
}
