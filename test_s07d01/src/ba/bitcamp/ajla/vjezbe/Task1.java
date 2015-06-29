package ba.bitcamp.ajla.vjezbe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Creates small GUI app that contains one JFrame with only one label.
 * It reacts when user clicks on the JFrame, changing label text and font.
 * @author ajla.eltabari
 *
 */
public class Task1 extends JFrame {

	private static final long serialVersionUID = -5521737809973257911L;
	
	private JLabel label = new JLabel();
	private Font font1 = new Font("Monospaced", Font.PLAIN, 35);
	private Font font2 = new Font("Serif", Font.BOLD, 35);
	
	public Task1() {
		setLayout(new BorderLayout());
		add(label);
		
		label.setFont(font1);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.addMouseListener(new Mouse());
		label.setText("Not clicked...");
		
		setSize(400, 300);
		setLocationRelativeTo(null);
		setTitle("Task1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task1();
	}
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() == label) {
				label.setFont(font2);
				label.setForeground(Color.RED);
				label.setText("It is clicked!");
			}
			
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
