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

public class Stone1 implements DrawingObject{
    private double x, y;
    private Color beige= new Color(232, 191, 162);
    private Color orange= new Color(200, 96, 78);
    private Color wine_red= new Color(115, 39, 71);

    public Stone1(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double square = new Rectangle.Double(x, y+4.5*3, 4.5,4.5);
        g2d.setColor(orange);
        g2d.fill(square);
        Rectangle2D.Double square2 = new Rectangle.Double(x+4.5, y+4.5*3, 4.5,4.5);
        g2d.setColor(beige);
        g2d.fill(square2);
        Rectangle2D.Double square3 = new Rectangle.Double(x+4.5*2, y+4.5*3, 4.5,4.5);
        g2d.setColor(beige);
        g2d.fill(square3);
        Rectangle2D.Double square4 = new Rectangle.Double(x+4.5*3, y+4.5*3, 4.5,4.5);
        g2d.setColor(beige);
        g2d.fill(square4);
        Rectangle2D.Double square5 = new Rectangle.Double(x+4.5*4, y+4.5*3, 4.5,4.5);
        g2d.setColor(beige);
        g2d.fill(square5);
        Rectangle2D.Double square6 = new Rectangle.Double(x+4.5*5, y+4.5*3, 4.5,4.5);
        g2d.setColor(orange);
        g2d.fill(square6);

        Rectangle2D.Double square7 = new Rectangle.Double(x, y+4.5*2, 4.5,4.5);
        g2d.setColor(wine_red);
        g2d.fill(square7);
        Rectangle2D.Double square8 = new Rectangle.Double(x+4.5, y+4.5*2, 4.5,4.5);
        g2d.setColor(orange);
        g2d.fill(square8);
        Rectangle2D.Double square9 = new Rectangle.Double(x+4.5*2, y+4.5*2, 4.5,4.5);
        g2d.setColor(beige);
        g2d.fill(square9);
        Rectangle2D.Double square10 = new Rectangle.Double(x+4.5*3, y+4.5*2, 4.5,4.5);
        g2d.setColor(beige);
        g2d.fill(square10);
        Rectangle2D.Double square11= new Rectangle.Double(x+4.5*4, y+4.5*2, 4.5,4.5);
        g2d.setColor(beige);
        g2d.fill(square11);
        Rectangle2D.Double square12= new Rectangle.Double(x+4.5*5, y+4.5*2, 4.5,4.5);
        g2d.setColor(beige);
        g2d.fill(square12);
        Rectangle2D.Double square13= new Rectangle.Double(x+4.5*6, y+4.5*2, 4.5,4.5);
        g2d.setColor(orange);
        g2d.fill(square13);

        
        Rectangle2D.Double square14 = new Rectangle.Double(x+4.5, y+4.5, 4.5,4.5);
        g2d.setColor(wine_red);
        g2d.fill(square14);
        Rectangle2D.Double square15 = new Rectangle.Double(x+4.5*2, y+4.5, 4.5,4.5);
        g2d.setColor(orange);
        g2d.fill(square15);
        Rectangle2D.Double square16 = new Rectangle.Double(x+4.5*3, y+4.5, 4.5,4.5);
        g2d.setColor(orange);
        g2d.fill(square16);
        Rectangle2D.Double square17= new Rectangle.Double(x+4.5*4, y+4.5, 4.5,4.5);
        g2d.setColor(orange);
        g2d.fill(square17);
        Rectangle2D.Double square18= new Rectangle.Double(x+4.5*5, y+4.5, 4.5,4.5);
        g2d.setColor(orange);
        g2d.fill(square18);
        Rectangle2D.Double square19= new Rectangle.Double(x+4.5*6, y+4.5, 4.5,4.5);
        g2d.setColor(wine_red);
        g2d.fill(square19);

        Rectangle2D.Double square20 = new Rectangle.Double(x+4.5*2, y, 4.5,4.5);
        g2d.setColor(wine_red);
        g2d.fill(square20); 
        Rectangle2D.Double square21 = new Rectangle.Double(x+4.5*3, y, 4.5,4.5);
        g2d.setColor(orange);
        g2d.fill(square21);
        Rectangle2D.Double square22= new Rectangle.Double(x+4.5*4, y, 4.5,4.5);
        g2d.setColor(orange);
        g2d.fill(square22);
        Rectangle2D.Double square23= new Rectangle.Double(x+4.5*5, y, 4.5,4.5);
        g2d.setColor(wine_red);
        g2d.fill(square23);
        Rectangle2D.Double square24= new Rectangle.Double(x+4.5*6, y, 4.5,4.5);
        g2d.setColor(wine_red);
        g2d.fill(square24);
    }

}