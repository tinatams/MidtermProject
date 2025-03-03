/**
    DrawingObject interphase that allows objects that implement it to be drawn.
	For an object to be drawn in the program it should implement DrawingObject.
	The interphase imports java.awt package because it needs the Graphics2D object 
	in order to draw objects. 
 
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

public interface DrawingObject{
	/**
     Abstract class that accepts a Graphics2D object in order to draw a particular object

     @param g2d = Graphics2D object to be use to draw graphics. 
     **/
    public void draw(Graphics2D g2d);
}