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

public class Square implements DrawingObject{
    private double x, y, w, h;
    private Color color = Color.BLACK;

    public Square(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

     public Square(double x, double y, double w, double h, Color color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double square = new Rectangle.Double(x, y, w, h);
        g2d.setColor(color);
        g2d.fill(square);
    }

    public void draw(Graphics2D g2d, Color color) {
        Rectangle2D.Double square = new Rectangle.Double(x, y, w, h);
        g2d.setColor(color);
        g2d.fill(square);
    }

}