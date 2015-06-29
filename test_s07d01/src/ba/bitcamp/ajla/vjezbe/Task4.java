package ba.bitcamp.ajla.vjezbe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Creates small GUI app that contains one JFrame and one JLabel.
 * The label looks different depending on mouse position 
 * @author ajla.eltabari
 *
 */
public class Task4 extends JFrame {

	private static final long serialVersionUID = -4050914307321038495L;
	private JLabel label = new JLabel("Some text");
	
	public Task4() {
		setLayout(new BorderLayout());
		add(label);
		
		setTitle("Task2");
		setSize(400, 300);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.BLACK);
		label.addMouseListener(new Mouse());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task4();
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
			if (e.getSource() == label) {
				label.setForeground(Color.GRAY);
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == label) {
				label.setForeground(Color.BLACK);
			}
		}
		
	}
}
