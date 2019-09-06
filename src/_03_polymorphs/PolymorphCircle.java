package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class PolymorphCircle extends Polymorph{

	protected int width = 50;
	protected int height = 50;
	
	int getWidth() {
		return width;
	}
	int setWidth(int d) {
		width = d;
		return width;
	}
	int getHeight() {
		return height;
	}
	int setHeight(int j) {
		height = j;
		return height;
	}
	
	PolymorphCircle(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
		
	}

}
