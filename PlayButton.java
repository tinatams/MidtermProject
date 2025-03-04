/**
    PlayerButton class is a composite shape that is comprised of a Circle and a Triangle object. Since this 
    class is drawn it uses DrawingObject interphase.

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

    /**
        Constructor that initializes the values of the x and y position. As well as size and colors 
        of the object

        @param x = x position of the object
        @param y = y position of the object
        @param scale = size of the object
        @param baseColor = color of the circle object
        @param playColor = color of the triangle object
     **/
    public PlayButton(double x, double y, double scale, Color baseColor, Color playColor){
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.baseColor = baseColor;
        this.playColor = playColor;
    }   

    /**
        Draws the Play Button objet by instantiating a Circle object and a Triangle object. And then calls
        the draw method on them to draw them out. 
        
        @param is the Graphics2D object
    **/
    public void draw(Graphics2D g2d){
        AffineTransform reset = g2d.getTransform();
        g2d.translate(x, y);

        Circle base = new Circle(0 ,0, 180, baseColor);
        Triangle tri = new Triangle(80, 130, 60, 60, playColor);
        tri.setRot(90+90+45);

        base.draw(g2d);
        tri.draw(g2d);

        g2d.setTransform(reset);
    }

}
