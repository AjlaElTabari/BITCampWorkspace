package ba.bitcamp.ajla.predavanja;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Edvin extends JPanel {
	private static final long serialVersionUID = 3463382643130669933L;

	private PointArray points;
	private Color activeColor;
	private int currentSize;

	private static Color[] supportedColors = new Color[] { Color.RED,
			Color.BLUE, Color.GREEN, Color.ORANGE, Color.PINK };
	JButton size1 = new JButton("Size 10");
	JButton size2 = new JButton("Size 15");
	JButton size3 = new JButton("Size 20");

	public Edvin() {
		super();

		points = new PointArray();
		setBackground(Color.WHITE);
		add(size1);
		add(size2);
		add(size3);
		size1.addMouseMotionListener(new MouseHandler());
		size2.addMouseMotionListener(new MouseHandler());
		size3.addMouseMotionListener(new MouseHandler());
		for (int i = 0; i < supportedColors.length; i++) {
			JButton color = new JButton("Pick");
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]);

			color.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton) e.getSource();

					String name = clicked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColors[index];

				}
			});
			add(color);
			addMouseMotionListener(new MouseHandler());
		}
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < points.gerLength(); i++) {
			Point p = points.elementAt(i);
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
		}
	}

	private class MouseHandler implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			Point newPoint = new Point(e.getX(), e.getY(), activeColor,
					currentSize);

			if (e.isShiftDown() == true) {
				newPoint.setColor(Color.WHITE);
			}
			if (e.getSource().equals(size1)) {
				newPoint.setSize(10);
				currentSize = 10;

			} else if (e.getSource().equals(size2)) {
				newPoint.setSize(15);
				currentSize = 15;
			} else if (e.getSource().equals(size3)) {
				newPoint.setSize(20);
				currentSize = 20;
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