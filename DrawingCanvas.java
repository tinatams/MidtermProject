import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent{
    Circle head = new Circle(630.69, 233.78, 45, 45);
    Circle left_hand = new Circle(604.61, 300.84, 29, 29);
    Circle right_hand = new Circle(602.39, 280.21, 29, 29);
    Circle left_elbow= new Circle(639.23, 316.44, 29, 29);
    Circle left_shoulder= new Circle(653.21, 286.41, 29, 29);


    Circle upper_torso= new Circle(647.14, 277.25, 41.9, 41.9);
    Circle mid_torso= new Circle(640.5, 334, 41.9, 118.4);
    Circle lower_torso= new Circle(661.13, 352.9, 41.9, 41.9);

    Circle left_knee= new Circle(630.69, 407.15, 29, 29);
    Circle right_knee= new Circle(682.08, 415.06, 29, 29);
    Circle left_foot= new Circle(607.69, 453, 29.5, 29.5);
    Circle right_foot= new Circle(722.18, 453,29.5, 29.5);

    Square l_left_arm= new Square(613.4,322.48,40.14,20.61);
    Square u_left_arm= new Square(641.62,303.8,45.64,22.96);
    Square right_arm= new Square(609.85,302.33,40,20);

    Square left_leg= new Square(594.07,409.51,105.97,30.13);
    Square u_right_leg= new Square(666.88,391.44,48.16,25.55);
    Square l_right_leg= new Square(692.04,434.33,48.16,27.92);
    public DrawingCanvas(){

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

        // left_knee.draw(g2d);
        right_knee.draw(g2d);
        left_foot.draw(g2d);
        right_foot.draw(g2d);

        AffineTransform originalTransform = g2d.getTransform();

        g2d.rotate(Math.toRadians(-10),347,250);  // Rotate 10 degrees

        mid_torso.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(26),(613.4+40.14),(322.48+20.61));
        l_left_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-62.9),(641.62+45.64/2),(303.8+22.96/2));
        u_left_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(41),629.85,312.33);
        right_arm.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-60),594.07+105.97/2,409.51+30.13/2);
        left_leg.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(82.9),666.88+48.16/2,391.44+25.55/2);
        u_right_leg.draw(g2d);

        g2d.setTransform(originalTransform);
        g2d.rotate(Math.toRadians(-136.5),692.04+48.16/2,434.33+27.92/2);
        l_right_leg.draw(g2d);


    }

}