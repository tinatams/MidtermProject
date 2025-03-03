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

public class Stone2 implements DrawingObject{
    public double x, y;
    public Color beige= new Color(232, 191, 162);
    public Color orange= new Color(200, 96, 78);
    public Color wine_red= new Color(115, 39, 71);

    public Stone2(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw(Graphics2D g2d) {  
        Square square = new Square(x+4.5*2, y+4.5*3, 4.5,beige);
        Square square2 = new Square(x+4.5, y+4.5*3, 4.5,beige);
        Square square3 = new Square(x, y+4.5*3, 4.5,orange);

        Square square4 = new Square(x+4.5*2, y+4.5*2, 4.5,beige);
        Square square5 = new Square(x+4.5, y+4.5*2, 4.5,beige);
        Square square6 = new Square(x, y+4.5*2, 4.5,orange);

        Square square7 = new Square(x+4.5*3, y+4.5, 4.5,orange);
        Square square8 = new Square(x+4.5*2, y+4.5, 4.5,orange);
        Square square9 = new Square(x+4.5, y+4.5, 4.5,orange);
        Square square10 = new Square(x, y+4.5, 4.5,wine_red);

        Square square11= new Square(x+4.5*2, y, 4.5,orange);
        Square square12= new Square(x+4.5, y, 4.5,orange);
        Square square13= new Square(x, y, 4.5,wine_red);

        square.draw(g2d);
        square2.draw(g2d);
        square3.draw(g2d);
        square4.draw(g2d);
        square5.draw(g2d);
        square6.draw(g2d);
        square7.draw(g2d);
        square8.draw(g2d);
        square9.draw(g2d);
        square10.draw(g2d);
        square11.draw(g2d);
        square12.draw(g2d);
        square13.draw(g2d);
    }

}
