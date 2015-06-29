package ba.bitcamp.ajla.predavanja;

import javax.swing.JFrame;

public class MainDrawPanel {

	public static void main(String[] args) {
		JFrame window = new JFrame("Our little program");
		DrawPanel dp = new DrawPanel(500, 500);
		
		window.add(dp);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setVisible(true);
		
		dp.drawSquare();

		
	}

}
