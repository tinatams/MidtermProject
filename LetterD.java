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
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.*;

public class LetterD implements DrawingObject{
    private double x, y, scale;
    private Color color;

    public LetterD(double x, double y, double scale, Color color){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x, y);

        Rectangle2D.Double vertBlock = new Rectangle2D.Double(0, 0, 23, 180);
        g2d.setColor(color);
        g2d.fill(vertBlock);

        Path2D.Double arc = new Path2D.Double();
        arc.moveTo(0,0);
        arc.curveTo(115, -8, 121, 55, 125.4, 90);
        arc.curveTo(123, 117, 131.4, 185, 0, 179);
        arc.lineTo(0, 149);
        arc.curveTo(138, 182.6, 122, 1, 0, 30);
        arc.lineTo(0, 0);
        arc.closePath();

        g2d.setColor(color);
        g2d.fill(arc);

        g2d.setTransform(reset);
    }
}
