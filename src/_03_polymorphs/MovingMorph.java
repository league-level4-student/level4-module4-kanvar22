package _03_polymorphs;

import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	Polymorph p = new RedMorph(x, y);

	
	
MovingMorph(int x, int y) {
		super(x, y);
	}

public void update() {
x++;
y++;

	
}

@Override
public void draw(Graphics g) {
	g.drawRect(x, y, 50, 50);
}

}
