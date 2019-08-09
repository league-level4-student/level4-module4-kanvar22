package _03_polymorphs;

import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	Polymorph p = new RedMorph(x, y);
	
MovingMorph(int x, int y) {
		super(x, y);
	}

public void update(int x, int y, Graphics g, int width , int height) {
	Polymorph s = new Bluemorph(x,y);
g.drawRect(x++, y++, width, height);
}

@Override
public void draw(Graphics g) {

}

}
