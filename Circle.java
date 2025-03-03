/**
    Circle class that implements DrawingObject interphase. Cirlce uses  Ellipse2D.Double 
    object from java.awt.geom package to create the shape, and g2d object to fill in the shape. 
 
	@author Martina Amale M. Llamas (242648); Zoe Angeli G. Uy (246707)
	@version March 3, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

import java.awt.*;
import java.awt.geom.*;

public class Circle implements DrawingObject {
    public double x, y, s;
    public Color color = new Color(41, 0, 36);

    public Circle(double x, double y, double s, Color color) {
        this.x = x;
        this.y = y;
        this.s =s;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, s,s);
        g2d.setColor(color);
        g2d.fill(circle);

    }

}
