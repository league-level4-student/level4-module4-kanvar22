package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    private ImageIcon icon = new ImageIcon("download.png");
    private JFrame window;
    private Timer timer;
    
    PolymorphJOp jop;
    PolymorphCircle circle;
    PolymorphFollow follow;
    PolymorphImage image;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();

    }
   
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");

   	 window.add(this);
   	 
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	Random k = new Random();
   	
   	jop = new PolymorphJOp(k.nextInt(), k.nextInt());
    follow = new PolymorphFollow(k.nextInt(), k.nextInt());
    window.addMouseMotionListener(follow);
    window.addMouseListener(jop);
    
    circle = new PolymorphCircle(250, 250);
    image = new PolymorphImage(300,300);
    		
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
   	 
    }
    
    public void paintComponent(Graphics g){ 
    	 
    	//draw background
    g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	follow.draw(g);
   	circle.draw(g);
   	circle.update();
   	jop.draw(g);
   	image.draw(g);
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	  repaint();
    	
   	jop.update();
   	follow.update();
   	circle.update();
   	image.update();
    }
}
