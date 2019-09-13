package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PolymorphFollow extends Polymorph implements MouseMotionListener{
	protected int width = 50;
	protected int height = 50;
	int newY;
	int newX;
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
	
	PolymorphFollow(int x, int y) {
		super(x, y);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		 newX = e.getX();
		 newY = e.getY();
	}
	
	@Override
	public void draw(Graphics g) {
g.setColor(Color.red);
		System.out.println("x = " + newX + " y = " + newY);
		g.fillRect(newX, newY, width, height);
		
	}

}
