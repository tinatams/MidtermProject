import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class P2 extends JComponent{
    double x=-21.25;
    double y=-6.18;
    Circle head = new Circle(630.69+x, 233.78+y, 45, 45);
    Circle left_hand = new Circle(604.61+x, 300.84+y, 29, 29);
    Circle right_hand = new Circle(602.39+x, 280.21+y, 29, 29);
    Circle left_elbow= new Circle(639.23+x, 316.44+y, 29, 29);
    Circle left_shoulder= new Circle(653.21+x, 286.41+y, 29, 29);


    Circle upper_torso= new Circle(647.14+x, 277.25+y, 41.9, 41.9);
    Circle mid_torso= new Circle(640.5+x, 334+y, 41.9, 118.4);
    Circle lower_torso= new Circle(661.13+x, 352.9+y, 41.9, 41.9);

    Circle left_knee= new Circle(606.59, 395.76, 29, 29);
    Circle right_knee= new Circle(670.08, 412.06, 29, 29);
    Circle left_foot= new Circle(606.39, 455.94, 29.5, 29.5);
    Circle right_foot= new Circle(712.18, 453,29.5, 29.5);

    Square l_left_arm= new Square(613.4+x,313.48+y,40.14,20.61);
    Square u_left_arm= new Square(641.62+x,303.8+y,45.64,22.96);
    Square right_arm= new Square(609.85+x,302.33+y,40,20);

    Square u_left_leg= new Square(610.07,379.2,48.16,25.55);
    Square l_left_leg= new Square(593.23,424.02,55.2,27.92);
    Square u_right_leg= new Square(645.3,388.34,64.12,27.55);
    Square l_right_leg= new Square(678.44,435.03,56.36,26.28);
    public P2(){

    }

    
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
         RenderingHints rh = new
        RenderingHints(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        head.draw(g2d);
        left_hand.draw(g2d);
        right_hand.draw(g2d);
        left_elbow.draw(g2d);
        left_shoulder.draw(g2d);

        upper_torso.draw(g2d);
        lower_torso.draw(g2d);

        left_knee.draw(g2d);
        right_knee.draw(g2d);
        left_foot.draw(g2d);
        right_foot.draw(g2d);

        AffineTransform originalTransform = g2d.getTransform();

        g2d.rotate(Math.toRadians(-10),347+x,250+y);  // Rotate 10 degrees

        mid_torso.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(26),(613.4+x+40.14/2),(313.48+y+20.61/2));
        l_left_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9),(641.62+x+45.64/2),(303.8+y+22.96/2));
        u_left_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(41),609.85+x+40/2,302.33+y+20/2);
        right_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(129),610.07+48.16/2,379.2+25.55/2);
        u_left_leg.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(90),593.23+55.2/2,424.02+27.92/2);
        l_left_leg.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(72),645.3+64.12/2,388.34+27.55/2);
        u_right_leg.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(43),678.44+56.36/2,435.03+26.28/2);
        l_right_leg.draw(g2d);


    }

}