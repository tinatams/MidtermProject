/**
    LetterN class that implements DrawingObject interphase. LetterN uses Rectangle2D.Double and Line object 
    from java.awt.geom package to create the shape of the letter N, and g2d object to fill in the shape. 
 
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

public class LetterN implements DrawingObject{
    private double x, y, scale;
    private Color color;

    /**
        Constructor that initializes the values of the x and y position. As well as size and color 
        of the object

        @param x = x position of the object
        @param y = y position of the object
        @param scale = size of the object
        @param color = color of the object
    **/
    public LetterN(double x, double y, double scale, Color color){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.color = color;
    }

    /**
        Initializes Rectangle2D objects to create the horizontal lines of N as well as a Line (basic shape)
        object for the diagonal line. Sets the color of the Graphics2D object to color (field), and then 
        fills in the shape of the Rectangle2D and Line objects. 

        @param is the Graphics2D object
    **/
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x, y);

        Rectangle2D.Double vertBlock = new Rectangle2D.Double(0, 0, 23, 180);
        Rectangle2D.Double vertBlock2 = new Rectangle2D.Double(103, 0, 23, 180);
        g2d.setColor(color);
        g2d.fill(vertBlock);
        g2d.fill(vertBlock2);
        Line diagBlock = new Line(20, 14, 106, 165, 21, color);
        diagBlock.draw(g2d);

        g2d.setTransform(reset);
    }
}
