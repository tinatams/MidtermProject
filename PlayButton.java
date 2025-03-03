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

public class PlayButton implements DrawingObject{
    private double x, y, scale, rotation;
    private Color baseColor, playColor;

    public PlayButton(double x, double y, double scale, Color baseColor, Color playColor){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.baseColor = baseColor;
        this.playColor = playColor;
    }

    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x, y);

        Circle base = new Circle(0 ,0, 180, 180, baseColor);
        RightTri tri = new RightTri(110, 90, 1.2, playColor);
        tri.setRot(135);

        base.draw(g2d);
        tri.draw(g2d);

        g2d.setTransform(reset);
    }

}