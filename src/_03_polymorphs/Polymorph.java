package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    
     
    
    public static void main(String[] args) {
    	MovingMorph n = new MovingMorph(x,y);
    	n.update(x, y, g, 50, 50);
	}
    
    int getx() {
    	return x;
    }
    int setx(int a) {
    x = a;
    return x;
    }
    
    int gety() {
    	return y;
    }
    int sety(int s) {
    	y = s;
    	return y;
    }
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    

    
    public abstract void draw(Graphics g);
}
