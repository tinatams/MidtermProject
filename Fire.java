/**
    The Fire class represents a fire attack from a Mob object and implements the DrawingObject interface, 
    allowing it to be drawn. It has x and y coordinate fields, an originalX field to store its initial
    position, and a scale field to determine its size. Additionally, it includes a drawable field to 
    indicate whether it can be drawn and an attacking field to track whether it is actively being used 
    as an attack. 
 
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

public class Fire implements DrawingObject {
    private int x, y, originalx;
    private double scale;
    private boolean drawable, attack;


    /**
    Constructor that initiates the x and y position of the Fire object as well as how big it will be. It
    also instansiates the other fields.

     @param x = x position and originalx
     @param y = y position
     @param scale = size/ scale of object
     drawable = false (Default state)
     attack = false (Default state)
     **/

    public Fire(int x, int y, double scale) {
        this.scale = scale;
        this.x = x;
        this.y = y;
        originalx = x;
        drawable = false;
        attack = false;
    }


    /**
     Instantiates three Circle objects to form the fire object. 
     Before drawing, the g2d object is translated to its starting x and y coordinates 
     in the scene and scaled according to the scale field.
     
     If the object is currently drawable then it draws the fire. And if the object is attacking
     then the x position of the object is updated so that it moves to the right.

     @param is Graphics2D object used to draw fire object
     **/

    @Override
    public void draw(Graphics2D g2d){
        if (drawable){
            AffineTransform reset = g2d.getTransform();
            g2d.translate(x, y);
            g2d.scale(scale, scale);
	    Circle basicCircle = new Circle(-80, -90, 180,new Color(255, 87, 87));
	    Circle middleCircle = new Circle(-67, -69, 153, new Color(255, 145, 77));
	    Circle highlCircle = new Circle(-55, -50, 130, new Color(255, 189, 89));

            basicCircle.draw(g2d);
            middleCircle.draw(g2d);
            highlCircle.draw(g2d);

            g2d.setTransform(reset);
        }

        if (attack){
            setX(x+7);
            if (x >= 350){
                drawable = false;
                attack = false;
                x = originalx;
            }
        }
    }

    /**
     Sets if the fire object is drawable
     @param is the new value of drawable
     **/
    public void setDrawable(boolean d){
        drawable = d;
    }

    /**
     Sets if the fire object is attacking
     @param is the new value of attacking
     **/
    
    public void setAttacking(boolean a){
        attack = a;
    }

    /**
     Sets the x position of the fire object, 
     @param is the new value of x
     **/
    public void setX(int x){
        this.x = x;
    }
}
