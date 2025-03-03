/**
    Line class that implements DrawingObject interphase. Line uses Graphics 2D object from java.awt package
    to draw a line in a certain color and thickness. 
 
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

public class Line implements DrawingObject {
    private int x1,y1,x2,y2;
    private float thickness;
    private Color color;

    /**
     Constructor that initializes the values of the starting x and y positions, the ending x and y positions,
     the thickness of the line, and the color of the line. 

     @param x1 = starting x position
     @param y1 = starting y position
     @param x2 = ending x position
     @param y2 = ending y position
     @param thickness = thickness of the line
     @param color = color of the line
     **/
    public Line(int x1, int y1, int x2, int y2, float thickness, Color color) {
        this.color = color;
        this.thickness= thickness;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /**
    Sets the color and thickness of the Graphics2D stroke, using fields of the object 
    Draws the line using Graphics2D object starting at x1 and y1, and ending at x2 and y2

    @param is the Graphics2D object
    **/
    @Override
    public void draw(Graphics2D g2d){
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.drawLine(x1, y1, x2, y2);
    };

}