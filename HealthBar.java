/**
    The HealthBar class represents the health of an Entity object. It is used to manipulate and visually
	represent the health of its owner (Entity object). Since the class needs to be drawin within the program
	it implements the interface DrawingObject. 
 
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

public class HealthBar implements DrawingObject{
	private Entity owner;
    private final int MAX_HEALTH = 100;
    private int currentHealth;
	private double x, y;

	/**
    	Constructor that initiates the x and y position of the Fire object as well as how big it will be. It
    	also instansiates the other fields.

     	@param owner = the owner/ Entity object that the health bar is associated with
     	@param x = x position
     	@param y = y position 
     	currentHealth = set to the MAX_HEALTH (as that is how much health the owner has)
    **/

    public HealthBar(Entity owner, int x, int y){
        currentHealth = MAX_HEALTH;
		this.owner = owner;
		this.x = x;
		this.y = y;
	}

	/**
     	Instantiates two `Rectangle2D.Double` objects to create the health bar's background and its representation
	 	(current health of the player). Everytime that the draw method is called upon the HealthBar class it will draw 
	 	the current points representation based on how much health the character currently has. 

     	@param is Graphics2D object used to draw Health Bar object
    **/

	public void draw(Graphics2D g2d){
		Rectangle2D.Double background = new Rectangle2D.Double(0 + x, 0 + y, MAX_HEALTH * 2.5, 25);
		Rectangle2D.Double currentPoints = new Rectangle2D.Double(0 + x, 0 + y, currentHealth * 2.5, 25);
		Color c= new Color(0,0,0);

		if (currentHealth >= 75){
			currentPoints = new Rectangle2D.Double(0 + x, 0 + y, currentHealth * 2.5, 25);
			c=Color.GREEN;
		} else if (currentHealth >= 50){
			currentPoints = new Rectangle2D.Double(0 + x, 0 + y, currentHealth * 2.5, 25);
			c=Color.YELLOW;
		} else if (currentHealth >= 25){
			currentPoints = new Rectangle2D.Double(0 + x, 0 + y, currentHealth * 2.5, 25);
			c=Color.ORANGE;
		} else {
			currentPoints = new Rectangle2D.Double(0 + x, 0 + y, currentHealth * 2.5, 25);
			c=Color.RED;
		}
		g2d.setColor(Color.GRAY);
	        g2d.fill(background);
		g2d.setColor(c);
	        g2d.fill(currentPoints);
	}

	/**
	 	Removes health from the current health
     	@param amount to be removed from the current health
    **/
	public void takeHealth(int amount){
        currentHealth -= amount;
    }

	/** 
		Gets the current health
		@return the current health
	**/
	public int getCurrentHealth(){
		return currentHealth;
	}
}
