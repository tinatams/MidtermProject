/**
    DrawingObject interphase is implemented by objects that are entities within the program/game,
	the interface is used to allow the entity to take damage. 
 
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

public interface Entity extends DrawingObject{
	/**
	 	Updates the health of entity object
     	@param amount, accepts an integer amount to be removed from the objects health
    **/
    public void takeDamage(int amount);
}