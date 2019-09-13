package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class PolymorphJOp extends Polymorph implements MouseListener{
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
	
	PolymorphJOp(int x, int y) {
		super(x, y);
	}
//	public void MouseClicked(MouseEvent e) {
//		if (e.MOUSE_CLICKED == 1) {
//			JOptionPane.showMessageDialog(null, "Hello");
//		}
//	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Hello");
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
