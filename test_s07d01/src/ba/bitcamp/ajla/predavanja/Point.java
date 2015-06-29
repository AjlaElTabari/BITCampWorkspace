package ba.bitcamp.ajla.predavanja;

import java.awt.Color;

public class Point {
	private int x;
	private int y;
	
	private Color color;
	
	private int size;
	
	public Point(int x, int y, Color color, int size) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.size = size;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
