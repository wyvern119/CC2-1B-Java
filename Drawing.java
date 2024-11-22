/*
Padilla, Renzo Ymanuel L.
November 22, 2024
Drawing/AWT
*/


import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas {
    public void paint (Graphics pix){
        pix.setColor(Color.GREEN);
        pix.drawRect(50, 50, 150, 100);
        
        pix.setColor(Color.BLUE);
        pix.fillRect(250, 50, 150, 100);
        
        Color rgb = new Color(255, 0, 0);
        pix.setColor(rgb);
        pix.drawOval(450, 50, 100, 100);
        
        pix.setColor(new Color(255, 0, 0));
        pix.fillOval(600, 50, 100, 100);
        
        pix.setColor(Color.BLACK);
        pix.drawLine(50, 200, 700, 200);
        
        pix.setColor(Color.BLACK);
        pix.drawLine(800, 50, 800, 200);
        
        pix.setColor(Color.BLACK);
        pix.drawLine(750, 50, 750, 200);
    }
    
    public static void main(String[] args){
        JFrame f = new JFrame("Java Drawing");
        Drawing canvas = new Drawing();
        f.setSize(1000,500);
        f.add(canvas);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
