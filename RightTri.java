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

public class RightTri{
    private double x, y, scale, rotation;
    private Color color;

    public RightTri(double x, double y, double scale, Color color){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.color = color;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();

        g2d.setColor(color);
        g2d.rotate(Math.toRadians(rotation), x, y);

        Path2D.Double triangle = new Path2D.Double();
        triangle.moveTo(x, y);
        triangle.lineTo(x+50, y);
        triangle.lineTo(x, y+50);

        g2d.setColor(color);
        g2d.fill(triangle);

        g2d.setTransform(reset);
    }

    public void setRot(double rotation){
        this.rotation = rotation;
    }

}