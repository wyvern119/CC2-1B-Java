/*
Padilla, Renzo Ymanuel L.
December 2, 2024
AWT Drawing
 */

//imports packages for drawing
import javax.swing.*;
import java.awt.*;

//creation of class for drawing the art
public class Pikachu extends Canvas {
    public void paint (Graphics pixel) {

        //ear outline
        pixel.setColor(Color.BLACK);
        pixel.fillOval(142, 10, 55, 160);
        pixel.fillOval(282, 10, 55, 160);

        //ears
        pixel.setColor(Color.BLACK);
        pixel.fillOval(145, 10, 50, 150);
        pixel.fillOval(285, 10, 50, 150);

        pixel.setColor(Color.YELLOW);
        pixel.fillOval(145, 35, 50, 120);
        pixel.fillOval(285, 35, 50, 120);

        //face outline
        pixel.setColor(Color.BLACK);
        pixel.fillOval(127, 155, 225, 130);
        pixel.fillOval(135, 94, 210, 185);

        //face
        pixel.setColor(Color.YELLOW);
        pixel.fillOval(130, 160, 220, 120);
        pixel.fillOval(140, 97, 200, 170);

        //cheeks
        pixel.setColor(Color.RED);
        pixel.fillOval(135, 200, 55, 55);
        pixel.fillOval(290, 200, 55, 55);

        //face yellow gaps
        pixel.setColor(Color.YELLOW);
        pixel.fillOval(152, 100, 45, 45);
        pixel.fillOval(283, 100, 45, 45);


        //mouth
        pixel.setColor(Color.BLACK);
        pixel.fillOval(205, 190, 40, 40);
        pixel.fillOval(235, 190, 40, 40);

        pixel.setColor(Color.YELLOW);
        pixel.fillOval(235, 175, 40, 50);
        pixel.fillOval(205, 175, 40, 50);
        pixel.fillOval(188, 195, 30, 30);
        pixel.fillOval(259, 195, 30, 30);

        //nose
        pixel.setColor(Color.BLACK);
        pixel.fillOval(235, 190, 10, 5);

        //eyes
        pixel.setColor(Color.BLACK);
        pixel.fillOval(275, 160, 40, 40);
        pixel.fillOval(165, 160, 40, 40);

        pixel.setColor(Color.WHITE);
        pixel.fillOval(185, 170, 15, 15);
        pixel.fillOval(280, 170, 15, 15);


    }

    //displays the values of shapes and colors into a window
    public static void main (String[] args) {

        //title of the window
        JFrame f = new JFrame ("Pikachu");
        Pikachu canvas = new Pikachu();

        //size of the window
        f.setSize(500, 500);

        //adds the shapes and colors
        f.add(canvas);

        //closes the program on exit
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //makes the art visible
        f.setVisible(true);
    }
}
