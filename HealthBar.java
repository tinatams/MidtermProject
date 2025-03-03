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

public class HealthBar implements DrawingObject{
    private final int MAX_HEALTH = 100;
    private int currentHealth;
	private Entity owner;

	private double x, y;

    public HealthBar(Entity owner, int x, int y){
        currentHealth = MAX_HEALTH;
		this.owner = owner;
		this.x = x;
		this.y = y;
	}

    public void takeHealth(int amount){
        currentHealth -= amount;
    }

	public int getCurrentHealth(){
		return currentHealth;
	}

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

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
		} else if (currentHealth >= 10){
			currentPoints = new Rectangle2D.Double(0 + x, 0 + y, currentHealth * 2.5, 25);
			c=Color.RED;
		}
		g2d.setColor(Color.GRAY);
	        g2d.fill(background);
		g2d.setColor(c);
	        g2d.fill(currentPoints);
			

	}
}
