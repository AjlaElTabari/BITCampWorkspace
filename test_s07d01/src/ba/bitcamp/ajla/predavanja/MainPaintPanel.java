package ba.bitcamp.ajla.predavanja;

import javax.swing.JFrame;

public class MainPaintPanel {

	public static void main(String[] args) {
		JFrame window = new JFrame("Our little program");
		PaintPanel dp = new PaintPanel();
		
		Edvin e = new Edvin();
		window.add(e);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setVisible(true);

		
		
//		window.add(dp);
//		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		window.setSize(500, 500);
//		window.setVisible(true);
		

	}

}
