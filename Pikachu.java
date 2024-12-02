import javax.swing.*;
import java.awt.*;

public class Pikachu extends Canvas {
    public void paint (Graphics pixel) {
        
        //face
        pixel.setColor(Color.YELLOW);
        pixel.fillOval(120, 160, 240, 140);
        
        pixel.setColor(Color.YELLOW);
        pixel.fillOval(140, 97, 200, 170);
        
        //cheeks
        pixel.setColor(Color.RED);
        pixel.fillOval(130, 210, 60, 60);
        
        pixel.setColor(Color.RED);
        pixel.fillOval(290, 210, 60, 60);
        
        //mouth
        pixel.setColor(Color.BLACK);
        pixel.fillOval(205, 190, 40, 40);
        
        pixel.setColor(Color.BLACK);
        pixel.fillOval(235, 190, 40, 40);
        
        pixel.setColor(Color.YELLOW);
        pixel.fillOval(235, 175, 40, 50);
        
        pixel.setColor(Color.YELLOW);
        pixel.fillOval(205, 175, 40, 50);
        
        pixel.setColor(Color.YELLOW);
        pixel.fillOval(185, 195, 30, 30);
        
        pixel.setColor(Color.YELLOW);
        pixel.fillOval(265, 195, 30, 30);
        
        //nose
        pixel.setColor(Color.BLACK);
        pixel.fillOval(235, 190, 10, 5);
        
        //eyes
        pixel.setColor(Color.BLACK);
        pixel.fillOval(275, 160, 40, 40);
        
        pixel.setColor(Color.BLACK);
        pixel.fillOval(165, 160, 40, 40);
        
        pixel.setColor(Color.WHITE);
        pixel.fillOval(185, 170, 15, 15);
        
        pixel.setColor(Color.WHITE);
        pixel.fillOval(280, 170, 15, 15);
    }
    
    public static void main (String[] args) {
        JFrame f = new JFrame ("Pikachu");
        Pikachu canvas = new Pikachu();
        f.setSize(500, 500);
        f.add(canvas);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
