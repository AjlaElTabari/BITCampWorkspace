package ba.bitcamp.ajla.predavanja;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {

	private static final long serialVersionUID = -2151370157218914474L;
	
	private PointArray points;
	private Color activeColor;
	private int currentSize = 15;
	private static Color[] supportedColors = new Color[] { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA };
	private static int[] availableSizes = { 10, 15, 20 };
	
	public PaintPanel() {
		super();
		
		points = new PointArray();
		setSize(500, 500);
		setBackground(Color.WHITE);
		
		for(int i = 0; i < supportedColors.length; i++) {
			JButton color = new JButton("Pick");
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]);
			
			color.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton)e.getSource();
					
					String name = clicked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColors[index];					
				}
			});
			add(color);
		}
		
		for (int i = 0; i < availableSizes.length; i++) {
			JButton size = new JButton("Size" + availableSizes[i]);
			size.setName(Integer.toString(i));
			
			size.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton)e.getSource();
					
					String name = clicked.getName();
					int index = Integer.parseInt(name);
					currentSize = availableSizes[index];					
				}
			});
			add(size);
		}
		

		addMouseMotionListener(new MouseHandler());
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i = 0; i < points.gerLength(); i++) {
			Point p = points.elementAt(i);
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
		}
	}
	private class MouseHandler implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			Point newPoint = new Point(e.getX(), e.getY(), activeColor, currentSize);
			
			if(e.isShiftDown()) {
				newPoint.setColor(Color.WHITE);
			}
			
			points.addPoint(newPoint);
			repaint();
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
