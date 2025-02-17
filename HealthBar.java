/**
    Health Bar Class
 
	@author Martina Amale M. Llamas (242648); INSERT ZOE INFO
	@version February 11, 2025
	
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

public class HealthBar{
    private final int MAX_HEALTH = 100;
    private int currentHealth;

    public HealthBar(){
        currentHealth = MAX_HEALTH;
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
}
