/**
    Health Bar Class
 
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

public class Triangle implements DrawingObject {
    private double x, y, b, h, rotation;
    private Color color = Color.BLACK;

    public Triangle(double x, double y, double b, double h) {
        this.x = x;
        this.y = y;
        this.b = b;
        this.h = h;
    }

    public Triangle(double x, double y, double b, double h, Color color) {
        this.x = x;
        this.y = y;
        this.b = b;
        this.h = h;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        AffineTransform reset = g2d.getTransform();

        g2d.setColor(color);
        g2d.rotate(Math.toRadians(rotation), x, y);

        Path2D.Double p = new Path2D.Double();
        p.moveTo(x,y);
        p.lineTo(x,y+h);
        p.lineTo(x+b,y+h);
        p.lineTo(x,y);
        g2d.setColor(color);
        g2d.fill(p);

        g2d.setTransform(reset);
    }

    public void draw(Graphics2D g2d, Color color) {
        AffineTransform reset = g2d.getTransform();

        g2d.setColor(color);
        g2d.rotate(Math.toRadians(rotation), x, y);

        Path2D.Double p = new Path2D.Double();
        p.moveTo(x,y);
        p.lineTo(x,y+h);
        p.lineTo(x+b,y+h);
        p.lineTo(x,y);
        g2d.setColor(color);
        g2d.fill(p);

        g2d.setTransform(reset);
    }

    public void setRot(double rotation){
        this.rotation = rotation;
    }
}
