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
import javax.swing.*;

public class EndScreen extends JComponent{

    private int width;
    private int height;

    public EndScreen(int w, int h){
        height = h;
        width = w;
    }

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform reset = g2d.getTransform();


        LetterE e = new LetterE(172.1, 55, 1, Color.BLACK);
        LetterD d = new LetterD(504.9, 55, 1, Color.BLACK);
        LetterN n = new LetterN(325.3, 55, 1, Color.BLACK);
        
        d.draw(g2d);
        e.draw(g2d);
        n.draw(g2d);

        PlayButton please = new PlayButton(310, 281, 1, Color.black, Color.white);

        please.draw(g2d);
        g2d.setTransform(reset);
    }

}