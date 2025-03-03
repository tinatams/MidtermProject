/**
    Square... Rectangle (?) class that implements DrawingObject interphase. The class uses Rectangle2D.Double 
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

public class Square implements DrawingObject{
    private double x, y, w, h;
    private Color color = Color.BLACK;

    /**
     Constructor that initializes the values of the x and y position. As well as width and height of the shape.  

     @param x = x position
     @param y = y position
     @param w = width
     @param h = height
     **/
    public Square(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    /**
     Constructor that initializes the values of the x and y position, width and height, and color of the square.  

     @param x = x position
     @param y = y position
     @param w = width
     @param h = height
     @param color = color
     **/
    public Square(double x, double y, double w, double h, Color color) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    /**
    Draws the square object by creating an instance of Rectangle2D using the fields as the inputs. 
    Sets the color of the Graphics2D object to color (field), and then fills in the shape.
    of Rectangle2D.double object. 

    @param is the Graphics2D object
    **/

    @Override
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double square = new Rectangle.Double(x, y, w, h);
        g2d.setColor(color);
        g2d.fill(square);
    }


    //remove thisss
    public void draw(Graphics2D g2d, Color color) {
        Rectangle2D.Double square = new Rectangle.Double(x, y, w, h);
        g2d.setColor(color);
        g2d.fill(square);
    }

}