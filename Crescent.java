/**
    Crescent class that implements DrawingObject interphase. Cirlce uses Path2D.Double 
    object from java.awt.geom package to create the package, and g2d object to fill in the shape. 

 
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

public class Crescent implements DrawingObject {
    public double x, y;
    public Color color;

    public Crescent(double x, double y,Color color) {
        this.x = x;
        this.y = y;
        this.color=color;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Path2D.Double crv = new
        Path2D.Double();
        crv.moveTo(x,y);
        crv.curveTo(x-60,y-50 ,x-20,y-50,x+80,y);
        g2d.setColor(color);
        g2d.fill(crv);

        Path2D.Double crv1 = new
        Path2D.Double();
        crv1.moveTo(x,y+5);
        crv1.curveTo(x-10,y-40 ,x-50,y-40,x+90,y+5);
        g2d.setColor(new Color(200, 96, 78));
        g2d.fill(crv1);
    }



}

