package _03_polymorphs;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class PolymorphImage extends Polymorph{
	protected int width = 50;
	protected int height = 50;
	BufferedImage img;
	
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
	
	PolymorphImage(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("download.png"));
		}
		catch{
			
		}
		
		
		g.drawImage(img, x, y, width, height, null);
		g.fillRect(x, y, width, height);
		
	}

}
